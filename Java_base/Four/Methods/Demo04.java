package Methods;

/**
 * final类
 * 无法被继承，常见String、Math、Integer包装类
 * 阻止动态代理技术使用（Struts Hibernate Spring）
 * @author 李泽坤
 *
 */
public class Demo04 {
	public static void main(String[] args) {

	}
}

final class Goo{
	
}

//class Koo extends Goo{}//编译错误，不能继承final类

//class MyString extends String{}//编译错误，不能继承final类