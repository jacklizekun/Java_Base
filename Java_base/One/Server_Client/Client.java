package Server_Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * 客户端
 * @author 李泽坤
 *
 */
public class Client {
	//用于与服务器端连接的Socket
	private Socket socket;
	//无参构造器
	public Client(){
		try{
			/**
			 * 实例化Socket，用于连接服务端的ServerSocket
			 * 参数1：服务端的ip地址 localhost表示本机
			 * 参数2：服务端打开的端口号
			 * 
			 */
			//打开本机的对应端口号
			socket = new Socket("localhost",8088);
		}catch(Exception e){
			
		}
	}
	public void start(){
		try{
			//创建新线程实例
			GetServerInfoHandler handler = new GetServerInfoHandler();
			Thread t = new Thread(handler);
			t.setDaemon(true);
			t.start();
			//扫描器扫描是否有键盘输入
			Scanner scanner = new Scanner(System.in);
			//创建输出字节流，输出到服务端
			OutputStream out = socket.getOutputStream();
			//输出字符流，编码gbk
			OutputStreamWriter osw = new OutputStreamWriter(out,"gbk");
			//输出流，输出
			PrintWriter writer = new PrintWriter(osw,true);
			
			while (true) {
				//从键盘读取一行内容，发送到服务端去
				writer.println(scanner.nextLine());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

	
	private class GetServerInfoHandler implements Runnable{
		public void run(){
			try{
				//读取服务端传回的数据
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"gbk"));
				while(true){
					String info = reader.readLine();
					if(info == null){
						break;
					}
					System.out.println(info);
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		//实例化一个客户端
		Client client = new Client();
		//启动客户端
		client.start();
	}
}