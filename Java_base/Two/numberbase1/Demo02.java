package numberbase1;
/**
 * 取余运算，取模运算
 * 负数取余的结果：负数和0
 * 
 * @author 李泽坤
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int n = 5;
		int m = n % 3;//5/3得1余2
		System.out.println(m);//2
		
		System.out.println(-9%3);//得-3余0
		System.out.println(-8%3);//得-2余-2
		System.out.println(-7%3);//得-2余-1
		System.out.println(-6%3);//得-2余0
		System.out.println(-5%3);//得-1余-2
		System.out.println(-4%3);//得-1余-1
		System.out.println(-3%3);//得-1余0
		System.out.println(-2%3);//得0余-2
		System.out.println(-1%3);//得0余-1
		System.out.println(-0%3);//得0余0
		System.out.println(1%3);//得0余1
		System.out.println(2%3);//得0余2
		System.out.println(3%3);//得1余0
		System.out.println(4%3);//得1余1
		System.out.println(5%3);//得1余2
		System.out.println(6%3);//得2余0
		System.out.println(7%3);//得2余1
		System.out.println(8%3);//得2余2
		System.out.println(9%3);//得3余0
		System.out.println(10%3);//得3余1
		System.out.println(11%3);//得3余2
		System.out.println(12%3);//得4余0
		System.out.println(13%3);//得4余1
	}

}
