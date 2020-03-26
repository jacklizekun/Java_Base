package list;

import java.math.BigInteger;
/**
 * BigInteger
 * @author 李泽坤
 *
 */
public class BigIntegerDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BigInteger num1 = new BigInteger("123");
		BigInteger num2 = BigInteger.valueOf(1);
		BigInteger num = new BigInteger("1");
		for(int i = 2;i<=200;i++){
			num = num.multiply(BigInteger.valueOf(i));
		}
		System.out.println(num);
	}
}




