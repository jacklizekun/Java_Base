package array;

import java.util.Random;
import java.util.Scanner;

/**
 * 字母猜测游戏
 * @author 李泽坤
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//存储用答案
		char[] answer;
		//存储输入字符
		char[] input;
		//次数
		int count = 0;
		//结果
		int[] result;
		//“生成答案”字符序列，5个字符
		answer = generate(5);
		//标题
		System.out.println("欢迎使用坤坤猜字符游戏！！");
		System.out.println(answer);
		while (true) {
			//等待用户的答案输入，调用静态方法
			input = Demo01.userInput();
			result = check(answer, input);//3）“检查用户输入”的答案，检查结构包含匹配数量和匹配位置
			count++;//统计回答数量
			show(count, result);//提示检查结果
			if (result[0] == 5 && result[1] == 5) {
				break;
			}
		}
	}
	//生成n个字符
	public static char[] generate(int n) {
		char[] chs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		//创建26数组内容为0/1的数组，代表是否使用过
		boolean[] used = new boolean[chs.length];
		int i;
		int index = 0;
		char[] answer = new char[n];
		Random r = new Random();
		do {
			//在26字母里面选择
			i = r.nextInt(chs.length);
			if (used[i]) {
			//如果使用过i，就继续下次循环
				continue;
			}
			//将字母不断填写到答案数组中
			answer[index++] = chs[i];
			//标记这一位数字使用过
			used[i] = true;		
			
		} while (index != n);
		return answer;
	}
	//静态方法：获取用户输入
	public static char[] userInput(){
		//Scanner扫描类获取键盘输入
		Scanner in = new Scanner(System.in);
		//创建输入数组
		char[] input = {};
		//一直进行
		while (true) {
			System.out.println("尽力猜吧：");
			//获取输入字符串
			String str = in.nextLine();
			//返回字符串中所有的字符。
			//"ABCDE"toCharArray返回{A,B,C,D,E}
			//toCharArray方法转换成数组
			input = str.toCharArray();
			if (5 == input.length) {
				break;
			}
			System.out.println("长度不对呀！");			
		}
		return input;
	}
	//静态方法，检查是否答对
	public static int[] check(char[] answer,char[] input) {
		int[] result ={0,0};
		//循环每一位
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (answer[i] == input[j]) {
					result[0]++;//匹配个数	
					if (i == j) {
						result[1]++;//匹配位置
					}
				}
			}
		}
		
		return result;
	}
	//回答的次数及正确率
	public static void show(int count,int[] result){
		System.out.println("猜测"+count+"次");
		System.out.println("匹配字符"+result[0]+"个");
		System.out.println("匹配位置"+result[1]+"个");
		if (result[0] == 5 && result[1] == 5) {
			System.out.println("恭喜你，猜对了！！");
			
		}
	}
}
