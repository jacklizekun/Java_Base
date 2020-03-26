package Char;

/**
 * Point类
 * Point没有显式的继承Object，但会默认的继承
 * @author 李泽坤
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	
	public String toString() {
		
		return "x=" + x + ",y=" + y;
	}
	
	
	public static void main(String[] args) {
		Point p = new Point(1,2);
		/**
		 * System.out.println(Object obj)
		 * 方法输出的就是给定对象的toString()方法的返回值。
		 */
		System.out.println(p);
		String info = p.toString();
		//输出对象句柄
		System.out.println(info);
		
		
		println(p);
		String s = "hello";
		println(s);
		
		/**
		 * "=="与"equals"的区别
		 * "=="比较是否是（指向）同一个对象
		 * "equals"比较两个对象内容是否一致
		 */
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		System.out.println("同一个对象："+(p1==p2));
		System.out.println("内容一样："+p1.equals(p2));
		
		
	}
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x && this.y == p.y;	
		}
		return false;
	}
	
	public static void println(Object obj){
		System.out.println(obj);
		//Object o = new Point(1, 2);	
	}
}








