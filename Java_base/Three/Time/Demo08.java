package Time;

/**
 * 内部类
 * 封装，限制类的定义范围，以共享访问外部类的属性和方法
 * @author 李泽坤
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		Koo k = new Koo();
		k.t();

	}

}

class Koo{
	int a = 8;
	public void t(){
		Foo f = new Foo();
		f.test();
	}
	
	//内部类
	class Foo{
		public void test(){
			System.out.println(Koo.this.a);//a
		}
	}
}