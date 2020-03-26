package numberbase1;

import java.util.Random;

/**
 * 逻辑运算：&&与 并且 ||或 或者 !非 否则 
 * @author 李泽坤
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		int age = 62;
		char sex = '女';
		
		if (sex == '女' && age >= 60){
			System.out.println("欢迎光临!体验坤坤理发!");	
		}else {
			System.out.println("欢迎下次光临！");
		}
		
		//判断一个字符是否是英文大写字符
		Random random = new Random();
		int n = random.nextInt(26);
		char c = (char) ('a' + n);//'A'~'Z' 65~90 65<=c<=90
		System.out.println(c);
		if ( c>='A' && c<='Z') {
			System.out.println("是大写字母："+c);
		} else if (c >='a' && c<='z') {
			System.out.println("是小写字母："+c);
			char tem = (char) (c - 32);
			System.out.println("转换为大写字母为："+tem);
		}

		if ((c>='A' && c<='Z') || (c>='a' && c<='z')) {
			System.out.println("是英文字母："+c);
		}
		System.out.println((int)c);
		
		
		
		
	}
}
