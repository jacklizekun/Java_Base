package list;
/**
 * Integer进制转换
 * @author 李泽坤
 *
 */
public class IntegerDemo4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = Integer.parseInt("123");
		double d = Double.parseDouble("12.3");
		//返回值时String类型
		String bStr = Integer.toBinaryString(100);
		String hStr = Integer.toHexString(100);
		
		System.out.println("100的2进制形式："+bStr);
		System.out.println("100的16进制形式："+hStr);
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		
		double dMax = Double.MAX_VALUE;
		double dMin = Double.MIN_VALUE;
		System.out.println(dMax);
		System.out.println(dMin);
	}
}
