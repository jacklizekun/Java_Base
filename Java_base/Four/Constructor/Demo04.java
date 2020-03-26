package Constructor;
/**
 * （Java Bean规范）所有类都提供无参数构造器
 * @author 李泽坤
 *
 */
public class Demo04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Boo boo = new Boo();
	}
}

class Aoo{
	Aoo() {
		System.out.println("无参数构造器被调用");
	}
	Aoo(int a){
		System.out.println("Aoo(int),有参数构造器被调用");
	}
}


class Boo extends Aoo{
	Boo(){

		//super(7);
		//super();
	}
}




