package Methods;
/**
 * 练习
 * @author 李泽坤
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Cat tom = new Cat(5);
		Cat kitty = new Cat(4);
		System.out.println(tom.age + "," + kitty.age+","+Cat.numOfCats);
	}
}

class Cat{
	int age;//实例变量
	static int numOfCats;//静态变量是属于类, 用类名进行访问
	public Cat(int age) {
		this.age = age;
		Cat.numOfCats++;
		//Cat，可以省略（注意此处不是this）
	}
}