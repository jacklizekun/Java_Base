package Structure;

/**
 * 封装方法
 * @author 李泽坤
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		double s = distance(3,4,6,8);//方法的调用 参数调用
		System.out.println(s);
		s = distance(0, 0, 5, 5);
		System.out.println(s);
		
	}	
	//计算距离的方法，封装了计算距离的功能
	public static double distance(int x1,int y1,int x2,int y2) {
		int a = x1 - x2;
		int b = y1 - y2;
		return Math.sqrt(a*a+b*b);//返回	
	}
}
