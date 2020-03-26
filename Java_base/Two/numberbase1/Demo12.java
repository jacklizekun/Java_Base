package numberbase1;
/**
 * 字符串连接、计算
 * +两端是字符串，就进行字符串连接
 * +两端数值，就进行加法运算
 * @author 李泽坤
 *
 */
public class Demo12 {

	public static void main(String[] args) {
		System.out.println(1 + '0');//49 int类型 
		System.out.println(1 + "0");//"10"数字与字符串“+”(连接)，得到的是字符串“10” 
		System.out.println(1 + '0' + "0");//“490”
	}

}
