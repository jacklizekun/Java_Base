package Thread;

/**
 * 实现Runnable接口创建线程
 * @author 李泽坤
 *
 */
public class Runnabel {
	public static void main(String[] args) {
		//前面两个线程抢占CPU时间较多
		Runn1 run1 = new Runn1();
		Runn2 run2 = new Runn2();
		Runnable run3 = new Runnable(){
			public void run(){
				for (int i = 0; i < 1000; i++) {
					System.out.println(i+"坤坤");
				}
			}
		};
		//三个线程
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		Thread t3 = new Thread(run3);
		//分别开启三线程
		t1.start();
		t2.start();
		t3.start();
	}
}
//线程1
class Runn1 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("睡觉？");
		}
	}
}

class Runn2 implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println("玩耍！");
		}
	}
}







