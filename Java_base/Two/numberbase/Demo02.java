package numberbase;

/**
 * long类型
 * 计算机时间规定：long类型从GMT 1970年元旦开始，累计的毫秒数作为时间，这个规定将时间转换为整数long
 * 时间是一个long型整数
 * @author 李泽坤
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//long max = 0x7fffffffffffffff;//编译错误，超过范围
		long max = 0x7fffffffffffffffL;
		System.out.println(max);
		
		//current当前的Time时间毫秒Millis的参数
		//获取当前系统（System）的时间毫秒数
		long now = System.currentTimeMillis();
		System.out.println(now);
		//1000毫秒，60秒，60分钟，24小时，365天
		long year = now/1000/60/60/24/365 + 1970;
		long tem = max/1000/60/60/24/365 + 1970;
		System.out.println(year);
		System.out.println(tem);		
	}

}
