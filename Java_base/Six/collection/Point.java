package collection;
/**
 * Comparable接口
 * @author 李泽坤
 *
 */
public class Point implements Comparable<Point> {
	
	public int compareTo(Point o) {
		int r = this.x * this.x + this.y * this.y;
		int r1 = o.x * o.x +o.y *o.y;
		
		
		return r-r1;
	}


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
		System.out.println(p);
		String info = p.toString();
		System.out.println(info);
		
		
		println(p);
		String s = "hello";
		println(s);
		
		/*
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
		//instanceof比较类型
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








