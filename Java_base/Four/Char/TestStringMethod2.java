package Char;
/**
 * 字符串检索方法
 * @author 李泽坤
 *
 */
public class TestStringMethod2 {
	public static void main(String[] args) {
		String str = "Thinking in Java";
		//返回Java在str中的位置
		System.out.println(str.indexOf("Java"));
		//从str第6个字符开始检索第一次出现in的位置
		int index = str.indexOf("in", 6);
		System.out.println("index="+index);
		//从str中检索最后一次出现in的位置
		int last = str.lastIndexOf( "in");
		System.out.println("last="+last);
		
		
		//获取字符串中指定位置的字符
		char chr = str.charAt(5);
		System.out.println("char:"+chr);
		
	}
	public native void print(String str);







}
