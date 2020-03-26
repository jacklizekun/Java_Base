package Char;
/**
 * 字符串方法
 * @author 李泽坤
 *
 */
public class TestStringMethod {
	public static void main(String[] args) {
		String str = "HelloWorld";
		String lower = str.toLowerCase();
		//将字符串转为小写
		String upper = str.toUpperCase();
		//将字符串转为大写
		
		System.out.println("lower："+lower);
		System.out.println("upper："+upper);
		
		String trim = str.trim();
		//去掉字符串两边的空白
		System.out.println("trim:" + trim);
		
		//查看str这个字符串是否以“Hel”开头
		boolean starts = str.trim().startsWith("Hel");
		System.out.println("是以Hel开头:"+starts);
		
		
		//查看str这个字符串是否以“orld”结尾
		boolean ends = str.trim().endsWith("orld");//等同于String trims = str.trim();
														//boolean ends = trims.endWith("orld");
		System.out.println("是以orld结尾:"+ends);
	
		boolean starts2 = str.trim().toLowerCase().startsWith("hell");
		System.out.println("是否以hell开头"+starts2);
		String trimsStr = str.trim();
		String lowerStr = trimsStr.toLowerCase();
		boolean start = lowerStr.startsWith("hell");
		System.out.println("是否以hell开头："+start);
		
		System.out.println("字符串长度："+str.length());
		
		
		
		
		
		
		
		
	}
}
