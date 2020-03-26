package numberbase1;
/**
 * 自增自减算法
 * @author 李泽坤
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int a = 1;
		/*int c = a++;//后++，先取a值，然后增加
		System.out.println(a);//2
		int d = ++a;//前++,先加a值，然后赋值
		System.out.println(c);//1
		System.out.println(a);//3
		System.out.println(d);//3
		*/
		int b = 1;
		b = b++;
		//++运算 1）先取b的值1作为"b++表达式"的值1
		//++运算 2）然后将b的值增加1，b为2
		//=运算  3）将b++表达式的值1赋值给b为1
		System.out.println(b);//1
		int d = b++;
		System.out.println(b);//2
		System.out.println(d);//1
		
		a = 1;
		System.out.println(a++);//1
		System.out.println(a);//2
		a = 1;
		System.out.println(++a);
		
	}
}
