package numberbase;
/**
 * float精度
 * @author 李泽坤
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		float fa = 5;
		float fb = 5;
		float fc = fa + fb;
		
		System.out.println(fc);//10.0
		int a = 0x7fffffff;//127
		int b = 0x7ffffff0;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a-b);//15
		fa = a;//转换时发生舍入误差，损失精度
		fb = b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(fa);
		System.out.println(fb);
		System.out.println(fa - fb);//说明float精度不高，有误差
		System.out.println(a + b);//超过int范围发生溢出了
		System.out.println(fa + fb);//float范围比int大
		
		double da = a;
		double db = b;
		System.out.println(da);
		System.out.println(db);
		System.out.println(da - db);
		System.out.println(da + db);	
		
		double pi = 3.1415926535897932384;
		//float f = 3.1415926535897932384;//编译错误
		//double字面量不能赋值给float
		float f = 3.1415926535897932384F;
		System.out.println(pi);
		System.out.println(f);
		
		//注意区别：1 1L 1.0 1D 1F
		//浮点数运算的不精确性,避免使用浮点数进行精确计算
		double x = 2.6;
		double y = x - 2;
		System.out.println(y);
		
		
		
		
		
		
	}

}
