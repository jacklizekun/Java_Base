package numberbase1;

import java.util.Scanner;
//条件选择
public class Demo10 {
	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.print("输入行数:");		
			int rows = in.nextInt();
			int size = 10;
			int pages;
			pages = rows%size ==0 ? rows/size : rows/size+1;
			System.out.println("分页数量："+pages);			
		}
	}

}
