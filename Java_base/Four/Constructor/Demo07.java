package Constructor;
/**
 * 重写
 * @author 李泽坤
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		Super obj = new Sub();
		obj.test(5);//obj引用的对象是Sub类型，执行Sub的方法
		obj = new Super();
		obj.test(5);//obj引用的对象是Super类型，执行Super的方法
	}

}
class Super{//鸟
	public void test(int a){//飞翔
		System.out.println("Super test(int),父类型方法被调用");
	}
}

class Sub extends Super{//企鹅

	@Override
	public void test(int a) {//飞翔被重写为游泳
		System.out.println("Sub test(int)，子类型方法被调用");
		//super.test(a);
	}
}