package Server_Client;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 服务端
 * @author 李泽坤
 *
 */

public class Server {
	// 服务端的ServerSocket
	private ServerSocket server;
	// 线程池
	private ExecutorService threadPool;
	// 存放所有客户端输出流的集合
	private Vector<PrintWriter> allOut;
	// 创建一个消息队列，保存所有待转发的信息
	private BlockingDeque<String> msgQueue;
	public Server() {
		try {
			System.out.println("启动服务器");

			// 初始化消息队列
			msgQueue = new LinkedBlockingDeque<String>();

			// 启动做消息转发的线程
			SendMsgToAllClientHandler sendHandler = new SendMsgToAllClientHandler();
			Thread t = new Thread(sendHandler);
			t.start();

			// 初始化存放所有客户端输出流的集合
			allOut = new Vector<PrintWriter>();

			// 初始化线程池
			threadPool = Executors.newCachedThreadPool();
			//服务端端口
			server = new ServerSocket(8088);

			System.out.println("服务器启动完毕");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void addClientOut(PrintWriter writer) {
		allOut.add(writer);
	}
	public synchronized void removeClientOut(PrintWriter writer) {
		allOut.remove(writer);
	}
	public synchronized void sendMsgToAllClient(String msg) {

		for (PrintWriter writer : allOut) {
			writer.println(msg);
		}
	}

	public void start() {
		try {
			while (true) {
				/*
				 * 若想让方法服务器端可以同时连接上不同的客户端那么我们就需要重复的调用accept()
				 * 这样服务端才能发现其他客户端的连接。 但这里要是使用循环来监听客户端的连接，带来的
				 * 问题就是不能与连上的客户端交互了。所以，我们要启动 线程，来处理与连上的客户端交互。
				 */
				/*
				 * Socket accept()阻塞方法，直到一个客户端Socket，连接，该方法才会返回，而返回的结果就是这个客户端的Socket
				 * 
				 */
				while (true) {
					System.out.println("等待客户端连接。。。");
					Socket socket = server.accept();
					System.out.println("一个客户端连接了！");
					//客户端的主机名和地址
					String hostName = socket.getInetAddress().getHostName();
					String address = socket.getInetAddress().getHostAddress();
					System.out.println("HostName:" + hostName);
					System.out.println("Address:" + address);
					//接收客户端发送的信息的线程
					GetClientInfoHandler handler = new GetClientInfoHandler(socket);
					//任务分配给线程池
					threadPool.execute(handler);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	//并发执行
	public class GetClientInfoHandler implements Runnable {
		// 用来交互的客户端Socket
		private Socket socket;
		public GetClientInfoHandler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			// 当前客户端的输出流为null
			PrintWriter writer = null;
			try {
				//获取客户端的输入流
				InputStream in = socket.getInputStream();
				//字符输入流编码为gbk
				InputStreamReader isr = new InputStreamReader(in, "gbk");
				//缓冲输入流
				BufferedReader reader = new BufferedReader(isr);
				writer = new PrintWriter(socket.getOutputStream(), true);
				addClientOut(writer);

				while (true) {
					String info = reader.readLine();
					if (info == null) {
						throw new RuntimeException("客户端异常");
					}

					msgQueue.offer(info);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (writer != null) {
						removeClientOut(writer);
					}
					socket.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	private class SendMsgToAllClientHandler implements Runnable {
		public void run() {
			while (true) {
				String msg = msgQueue.poll();
				if (msg != null) {
					sendMsgToAllClient(msg);
				} else {
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}

}