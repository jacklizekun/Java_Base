package Algorithm;
/**
 * 移位运算
 * @author 李泽坤
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		int i = -2;
		System.out.print("原始数据：");
		System.out.print(Integer.toBinaryString(i));//11111111111111111111111111111110
		System.out.println();
		int n = i<<1;
		System.out.print("左移一次：");
		System.out.print(Integer.toBinaryString(n));//11111111111111111111111111111100
		System.out.println();
		
		i = -4;
		System.out.print("原始数据：");
		System.out.print(Integer.toBinaryString(i));//11111111111111111111111111111100
		System.out.println();
		n = i >> 1;
		System.out.print("右移一次：");
		System.out.print(Integer.toBinaryString(n));//11111111111111111111111111111110
		System.out.println();
		
		i = 10;
		System.out.print("原始数据：");
		System.out.print(Integer.toBinaryString(i));//1010
		System.out.println();
		n = i<<1;
		System.out.print("左移一次：");
		System.out.print(Integer.toBinaryString(n));//10100
		System.out.println();
		
		i = 10;
		System.out.print("原始数据：");
		System.out.print(Integer.toBinaryString(i));//1010
		System.out.println();
		n = i >> 1;
		System.out.print("右移一次：");
		System.out.print(Integer.toBinaryString(n));//101
		System.out.println();
		
		i = 10;
		System.out.print("原始数据：");
		System.out.print(Integer.toBinaryString(i));//1010
		System.out.println();
		n = i >>> 1;
		System.out.print("右移一次：");
		System.out.print(Integer.toBinaryString(n));//101
		System.out.println();
		
		i = -4;
		System.out.print("原始数据：");
		System.out.print(Integer.toBinaryString(i));//11111111111111111111111111111100
		System.out.println();
		n = i >>> 1;
		System.out.print("右移一次：");
		System.out.print(Integer.toBinaryString(n));//1111111111111111111111111111110
		System.out.println();
	
		
	}
}
