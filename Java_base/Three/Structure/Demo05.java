package Structure;

/**
 * 练习： 学生成绩管理
 * 功能：成绩输入、成绩列表、查询成绩
 */
import java.util.Scanner;


public class Demo05 {

	public static void main(String[] args) {
		boolean flag = false;
		//判断是否和输入的姓名符合
		int n = 0;
		//保存姓名所在位置
		String[] names = {"Tom","Jerry","Andy","John"};
		int[] score = new int[names.length];
		//处理控制台命令
		Scanner in = new Scanner(System.in);
		//输出菜单
		System.out.println("\t欢迎使用成绩管理");
		//一直进行
		while (true) {
			System.out.print("1.成绩录入 2.成绩单 3.查询 0.离开 选择");
			
			String cmd = in.nextLine();
			//从控制台读取一行字符串
			//比较字符
			if ("0".equals(cmd)) {
				System.out.println("亲，再见了");
				break;
			}else if ("1".equals(cmd)) {
				System.out.println("开始输入成绩");
				for (int i = 0; i < names.length; i++) {
					String name = names[i];
					//name代表每个人名
					System.out.println("输入"+name+"的成绩：");
					String str = in.nextLine();
					//parseInt将10进制的字符串转换成整数
					score[i] = Integer.parseInt(str);
					
				}
			}else if ("2".equals(cmd)) {
				//成绩单
				int sum = 0;
				for (int i = 0; i < names.length; i++) {
					String name = names[i];
					System.out.println((i+1)+"."+name+"的成绩"+score[i]);
					sum += score[i];
				}
				
				System.out.println("平均成绩："+(sum/names.length));
			}else if ("3".equals(cmd)) {
				//查询
				System.out.println("输入查询人名：");
				String name = in.nextLine();
				for (int i = 0; i < names.length; i++) {
					if (name.equals(names[i])) {
						flag = true;
						n = i;
						break;
						//System.out.println((i+1)+"."+name+"的成绩"+score[i]);
					}	
				}
				if (flag) {
					System.out.println((n+1)+"."+name+"的成绩"+score[n]);
					
				} else {
					System.out.println("查无此人");

				}
			}else {
				System.out.println("命令错啦！！");
				
			}
		}
		
		
	}

}
