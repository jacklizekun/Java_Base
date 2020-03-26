package Algorithm;
/**
 * 练习
 * IP地址
 * @author 李泽坤
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		int d1 = 192;//00000000 00000000 00000000 11000000
		int d2 = 168;//00000000 00000000 00000000 10101000
		int d3 = 10; //00000000 00000000 00000000 00001010
		int d4 = 23; //00000000 00000000 00000000 00010111
		
		
		
		int ip;      //11000000 10101000 00001010 00010111
		ip = (d1<<24)+(d2<<16)+(d3<<8)+(d4<<0);
		
		System.out.println(Integer.toBinaryString(ip));
		
		
		
	}

}
