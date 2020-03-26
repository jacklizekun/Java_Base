package Constructor;
/**
 * 默认构造器
 * @author 李泽坤
 *
 */
public class Demo01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Foo foo = new Foo();//调用的是默认构造器
		System.out.println();
//		Koo koo = new Koo();//编译错误，Koo()没有构造器
		Koo k1 = new Koo(8);//调用Koo(int)构造器
	}

}

class Foo{//Foo(){} 默认构造器
	}
class Koo{
	Koo(int a){
		System.out.println("Koo(int)");
	}
}