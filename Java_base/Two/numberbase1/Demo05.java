package numberbase1;
/**
 * 自增自减
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		int a = 1;
		int b;
		b = ++a; //先++:先增加，再使用
		//运算顺序：先++执行结束，再赋值=
		//++ 运算 1）先将a的值增加1，a为2
		//++ 运算 2）再取a的值2作为"++a"表达式的值2
		//= 运算 3）将"++a 表达式"的值2赋值给b为2
		System.out.println(a+","+b);//2,2
	}
}
