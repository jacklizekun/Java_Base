package Constructor;
/**
 * 子类super()默认调用父类无参数构造器
 * @author 李泽坤
 *
 */
public class Demo03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Moo moo = new Moo();
	}
}

class Noo{
	Noo(){
		System.out.println("Noo()，父类构造器被调用");
	}
}
class Moo extends Noo{
	Moo(){
		super();//加不加此语句运行结果一样
		System.out.println("子类构造器被调用");
	}
}