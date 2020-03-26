package string;

/**
 * 字符串支持正则表达式验证
 * @author 李泽坤
 *
 */
public class StringRex {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String mail = "123@kunkun.com";
		String info = "\\w";
		String rex = "[\\w]+@[0-9a-zA-Z]+\\.com";//转义
		System.out.println(rex);
			
		//matches方法验证
		if (mail.matches(rex)) {
			System.out.println("是一个邮箱地址");
		}else {
			System.out.println("不是一个邮箱地址");
		}	
		
		
		String phoneRex = "(\\+86|0086)?\\s?[\\d]{11}";
		
		String phoneNum = "0086 12345680901";
		if(phoneNum.matches(phoneRex)){
			System.out.println("这是一个手机号码");
		}else {
			System.out.println("这不是一个手机号码");
		}
		
		String idCardRex = "[\\d]{15}|([\\d]{17}[xX0-9])";
		String idCardnum = "370829198900001";
		//需要验证的.matches(正则表达式)
		if (idCardnum.matches(idCardRex)) {
			System.out.println("合法的身份证号");
		}else {
			System.out.println("身份证格式非法");
		}
		
		
		
		
		
	}
}
