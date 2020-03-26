package Structure;

/**
 * 勾股定理
 * @author 李泽坤
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		//			x,y
		int[] p1 = {3,4};//代表一个点的坐标
		int[] p2 = {6,8};
		int a = p1[1] - p2[1];//y的差
		int b = p1[0] - p2[0];//x的差
		
		//Math.sqrt是Java API提供的开平方数学函数
		double c = Math.sqrt(a*a + b*b);
		
		System.out.println(c);
		
		
		 
		
	}

}
