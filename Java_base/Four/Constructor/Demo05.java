package Constructor;

/**
 * 继承时java对象的初始化过程
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		System.out.println(z.a+","+z.b+"，"+z.c);
	}
}

class Xoo{
	int a = 0;
	public Xoo(){
		/*属性初始化*/
		a = 10;
		}
}

class Yoo extends Xoo{
	int b = 2;
	public Yoo(){
		super(); 
		/*属性初始化*/ 
		a = 5; b = 6;}
}

class Zoo extends Yoo{
	int c = 5;
	public Zoo(){
		super();
	//System.out.println(a+","+b+","+c);
	/*属性初始化*/
		a = 8; b = 9; c = 6;
		}
}






