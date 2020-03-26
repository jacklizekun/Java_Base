package map;


/**
 * 测试HashMap的Key
 * @author 李泽坤
 *
 */
public class Point {
	private int x = 0;
	public Point(int x){
		this.x = x;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int hashCode(){
		return x ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point)obj;
			return this.x == p.x;
		}
		return false;
	}
	
	
	
}
