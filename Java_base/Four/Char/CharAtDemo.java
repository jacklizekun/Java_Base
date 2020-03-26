package Char;

/**
 * 字符串charAt
 * @author 李泽坤
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		//			 0 1 2 3 4 5 6 7 8
		String str = "上海自来水来自海上";
		System.out.println(str.length());
		/**
		 * 检测回文的思路：
		 * 正数位置的字符和倒数位置的字符一样就是回文
		 */
		for(int i = 0;i<str.length()/2;i++){
			if(
				str.charAt(i)
				!=
				str.charAt(str.length()-1-i)
					
			){
				System.out.println("不是回文");
				return;
				//如果是void类型的函数，可以使用return使当前方法不再执行，返回到void函数之外
			}
		}
		
		
		System.out.println("是回文");
		
		
		
		
		
	}
	
}
