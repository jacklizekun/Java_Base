package Algorithm;
/**
 * 位运算符
 * @author 李泽坤
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		int d1 = 1;//00000000 00000000 00000000 00000001
		int d2 = 2;//00000000 00000000 00000000 00000010
		int d3 = 4;//00000000 00000000 00000000 00000100
				  //+-----------------------------------		
				  // 00000000 00000000 00000000 00000111
		int i = d1|d2|d3;
		System.out.println(Integer.toBinaryString(i));
		
		//将24位int彩色，拆分为颜色分量rgb
		//			   r g b
		int color = 0x685FBF;   //00000000 01101000 01011111 10111111
		int mask = 0xff;	    //00000000 00000000 00000000 11111111
		int blue = color&mask;//&----------------
							    //00000000 00000000 00000000 10111111
		
		int green = (color>>>8)&mask;
		int red = (color>>>16)&mask;
		System.out.println(red);
		System.out.println(green);
		System.out.println(blue);
		
		//反色
		int c = ~color;
		System.out.println(c);
		
		
		
	}
}
