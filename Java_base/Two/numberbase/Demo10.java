package numberbase;

import java.util.Random;

/**
 * 随机生成A~Z的某个字符
 * @author 李泽坤
 *
 */
public class Demo10 {

	public static void main(String[] args) {
		//‘A’ + n,n范围[0,26)
		Random random = new Random();
		int n =random.nextInt(26);
		System.out.println(n);
		//'A'+n,n范围[0,26)
		char c = (char)('A'+n);
		System.out.println(c);
		System.out.println((int)'A');
		System.out.println((int)c);
		
		System.out.println('中'*'国');	
	}

}
