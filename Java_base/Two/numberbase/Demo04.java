package numberbase;

import java.math.BigDecimal;

/**
 * BigDecimal
 * Java中精确小数计算的解决方案
 * BigDecimal API类实现了精确的定点小数计算
 *	@author 李泽坤
 */
public class Demo04 {
	public static void main(String[] args) {
		BigDecimal x = new BigDecimal("2.6");
		BigDecimal y = new BigDecimal("2");
		//subtract减法
		BigDecimal z = x.subtract(y);
		System.out.println(z);
		//add加法
		z = x.add(y);
		System.out.println(z);
		//multiply乘法
		z = x.multiply(y);
		System.out.println(z);
		//multiply乘法x*y*y
		z = x.multiply(y).multiply(y);
		System.out.println(z);
		//divide除法
		z = x.divide(y);
		System.out.println(z);		
	}

}
