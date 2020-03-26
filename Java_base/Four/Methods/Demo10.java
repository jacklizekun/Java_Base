package Methods;
import java.util.Arrays;
/**
 * final引用
 * final引用类型的引用值（地址值）不能再改变，也就是不能改变引用关系了，但是被引用的对象的属性可以更改
 * @author 李泽坤
 *
 */
public class Demo10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final int a = 5;//变量a的值不能再次修改
		//a = 4;
		
		//ary是引用变量，值是地址值，通过地址间接引用了数组
		final int[] ary = {5,6};//变量ary的值不能再改了
		//ary = new int[3];//编译错误
		
		ary[0] += 3;
		System.out.println(Arrays.toString(ary));//8 6
		
		
	}
	

}

