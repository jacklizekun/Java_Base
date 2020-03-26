package file3;

import java.io.Serializable;

/**
 * Serializable子类
 * @author 李泽坤
 *
 */
public class Point implements Serializable{

	private static final long serialVersionUID = 1L;
	private int x;
	//被transient修饰的属性，在序列化时会被忽略
	private transient int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
