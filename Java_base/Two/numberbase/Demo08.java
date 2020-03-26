package numberbase;

/**
 * Java字符的数值是unicode编码值
 * 字符和数字转换
 * @author 李泽坤
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		char c = 20013;
		
		System.out.println((int)(c));
		System.out.println(c);//中
		c = 65;
		System.out.println(c);//不可显示
		
		c = 'A' +2;
		System.out.println(c);
		System.out.println("A="+(int)'A');
		System.out.println("B="+(int)'B');
		System.out.println("C="+(int)'C');
		
		//...
		System.out.println("Z="+(int)'Z');
		//'0' ~ '9' 'a' ~ 'z' 每个人姓名的编码
		System.out.println("欧＝"+(int)'欧');
		System.out.println("阳＝"+(int)'阳');
		System.out.println("体＝"+(int)'体');
		System.out.println("金＝"+(int)'金');
		
		System.out.println("0＝"+(int)'0');
		System.out.println("1＝"+(int)'1');
		System.out.println("6＝"+(int)'6');
		System.out.println("9＝"+(int)'9');
		System.out.println("a＝"+(int)'a');
		System.out.println("b＝"+(int)'b');
		System.out.println("z＝"+(int)'z');
		System.out.println("A＝"+(int)'A');
		System.out.println("B＝"+(int)'B');
		System.out.println("Z＝"+(int)'Z');
		
		System.out.println(",＝"+(int)',');
		System.out.println(".＝"+(int)'.');
		System.out.println("/＝"+(int)'/');
		System.out.println(";＝"+(int)';');
		System.out.println(" ＝"+(int)' ');
		System.out.println("@＝"+(int)'@');
		System.out.println("^＝"+(int)'^');
		System.out.println("*＝"+(int)'*');
		System.out.println("=＝"+(int)'=');
		System.out.println("＝＝"+(int)'＝');		
	}

}
