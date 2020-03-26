package Structure;

/**
 * 数组
 * 数组变量：是引用数组的变量，是引用变量。
 * @author 李泽坤
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		//int[] arr = new int[100];
	//定义数组变量
		int[] ary;
		//System.out.println(ary[0]);//编译错误，ary没有初始化。
		//ary = null;//null空，没有
		//System.out.println(ary[0]);//运行异常，空指针异常。
		/*空指针异常发生的原因：引用类型的变量的值是null，不引用任何的对象
		 * 当利用引用变量访问属性（数组元素）和方法时，出现空指针异常。
		 */
	//创建数组对象
		ary = new int[3];
		//创建数组对象(new int[3]),将对象的引用赋值给ary变量
		System.out.println(ary[0]);//0
		System.out.println(ary[1]);//1
		System.out.println(ary[2]);//2
		//System.out.println(ary[3]);//3。异常，数组越界。
		
		
		//Java数组元素是自动初始化的，初始化为零值.
		//0 0。0 \u0000 null false

		double[] ary3 = new double[3];
		System.out.println(ary3[0]);//0.0
		
		char[] chs = new char[4];
		System.out.println((int)chs[0]);//0 \u0000de 编码值是0
		
		boolean[] used = new boolean[5];
		System.out.println(used[0]);//false
		
		String[] names = new String[3];
		System.out.println(names[0]);//null
		
		//new 类型[长度]
		//类型是任何类型：基本类型、类类型(String,Integer)
		//长度：变量或常量值：0~Integer.MAX_VALUE
		ary = new int[4];//new int[0x7fffffff],内存中装不下
		
		//new类型[]{元素0，元素1，元素2}
		//直接给出元素，元素直接初始化，元素的个数就是长度
		ary = new int[]{2,3,4};
		System.out.println(ary[0]);//2
		
		//静态初始化
		//类型[] 变量={元素0，元素1，元素2}
		ary = new int[]{4,5,6};//没有问题
		
		ary = new int[]{5,6,7};
		System.out.println(ary.length);//3
		ary[1]++;
		System.out.println(ary[1]);//7
		System.out.println(ary[ary.length-1]);//7
		//System.out.println(ary[-1]);//运行异常

		for (int i = 0; i < ary.length; i++) {
			//i = 0 1 2 ...ary.length-1
			System.out.println(ary[i]);//
		}

		
	}
	
}
