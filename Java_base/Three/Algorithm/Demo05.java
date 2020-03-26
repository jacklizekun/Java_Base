package Algorithm;
/**
 * 移位运算优势
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//最快速的实现n*8(2的n次幂)
		int n = 16;  //00000000 00000000 00000000 00000101
		int a = n<<3;//00000 00000000 00000000 00000101 000   
		System.out.println(a);//40
		
		//最快速的实现n/8
		int b = n>>3;
		System.out.println(b);
	}

}
