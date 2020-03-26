package Thread;

import Thread.Table.Person;

/**
 * 多线程安全性问题
 * @author 李泽坤
 *
 */
public class Syn {
	public static void main(String[] args){
		Table table = new Table();
		Person p1 = table.new Person();
		Person p2 = table.new Person();
		p1.start();
		p2.start();
	}
}

class Table{
	int beans = 20;
	public int getBean(){
		//同步性问题
		synchronized (this) {
			if (beans == 0) {
				throw new RuntimeException("0");
			}
			Thread.yield();
			return beans--;
		}
	}
	
	class Person extends Thread{
		public void run(){
			while(true){
				int bean = getBean();
				//Thread-x x为数字
				System.out.println(getName()+":"+bean);
				Thread.yield();
			}
		}
	}
}
