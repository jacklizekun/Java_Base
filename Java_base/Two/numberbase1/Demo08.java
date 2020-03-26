package numberbase1;

/**
 * 短路逻辑
 * &&是短路逻辑运算，当第一个表达式是false的时候，就直接得结果
 * &非短路逻辑运算，只有当两个表达式同时为false的时候，才可得到结果
 * @author 李泽坤
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		int age = 25;
		char sex = '男';
		
		if ((sex == '女') && (age++ >= 60)){
			System.out.println("欢迎光临!体验养生之美!");
		}else {
			System.out.println("欢迎下次光临！");
		}
		System.out.println(age);//25发生短路了，age++没有执行
		
		
		if ((sex == '女') & (age++ >= 60)){
			System.out.println("欢迎光临!体验养生之美!");

		}else {
			System.out.println("欢迎下次光临！");
		}
		System.out.println(age);//没有发生短路了，age++被执行	
	}

}
