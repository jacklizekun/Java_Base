package Constructor;
/**
 * 构造器继承
 * @author 李泽坤
 *
 */
public class Demo02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Hoo h1 = new Hoo();
		//Hoo h2 = new Hoo(8);//编译错误，Hoo类中没有Hoo(int)
		//说明Hoo没有继承Goo(int)构造器
	}
}


class Goo{
	Goo(){}
	Goo(int a){
		System.out.println("Goo(int)");
	}
}

class Hoo extends Goo{
	
}