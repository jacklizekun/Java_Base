package Algorithm;
/**
 * int ---- byte
 * @author 李泽坤
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		int i = -4;//0xff ff ff fc
		//			   d1 d2 d3 d4
		int d1,d2,d3,d4;
		//d1 = 0xff;
		//d2 = 0xff;
		//d3 = 0xff;
		//d4 = 0xfc;
		
		
		int mask = 0xff;
		d1 = (i>>>24)&mask;
		d2 = (i>>>16)&mask;
		d3 = (i>>>8)&mask;
		d4 = (i>>>0)&mask;
		
		System.out.println(Integer.toBinaryString(d1));
		System.out.println(Integer.toBinaryString(d2));
		System.out.println(Integer.toBinaryString(d3));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(d4));
	}
}
