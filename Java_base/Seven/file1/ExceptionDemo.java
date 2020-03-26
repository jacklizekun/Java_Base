package file1;
/**
 * 异常捕获try catch 
 * @author 李泽坤
 *
 */
public class ExceptionDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try{
		String str = "123,0";
		//输出字符串长度
		//引发空指针异常NullPointerException
		/*
		 * 当出现str.length()这句话运行时，会引发空指针异常
		 * JVM会创建一个NullPointerException实例，并设置
		 * 出错的详细信息在这个实例中，并把它抛出到lengtg()方法外。
		 * 之后JVM会检查main方法之中是否含有try语句包含出错的这行代码，
		 * 若没有则抛出到main方法外，若有，则尝试将NullPointerException实例
		 * 通过参数的形式传递到catch圆括号指定的空指针异常参数中去解决。
		 * 
		 */
		System.out.println(str.length());
		String[] array = str.split(",");
		
		//将拆分的字符串转换为数字
		int a = Integer.parseInt(array[0]);
		//可能出现数组下标越界
		int b = Integer.parseInt(array[1]);
		
		int c = a/b;//出现除数不能为零的异常
		
		}catch(NullPointerException e){
			System.out.println("出现了空指针异常");
//			throw e;//主动抛出异常
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("出现了数组越界了！");
		}catch(NumberFormatException e){
			System.out.println("出现了数字格式异常！");	
		}
		System.out.println("程序结束了");
	}
}
	
