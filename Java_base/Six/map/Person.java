package map;
/**
 * 模板模式
 * @author 李泽坤
 *
 */
public abstract class Person {
	public void sayHello(){
	
		System.out.println("大家好！");
		System.out.println(getInfo());
		System.out.println("再见！");
	}
	
	public abstract String getInfo();
	
	
}

class Student extends Person{

	@Override
	public String getInfo() {
		
		return "我是一名学生，我上了12年小学！";
	}
	
}

class Teacher extends Person{

	@Override
	public String getInfo() {
	
		return "我是一名老师，我也不知道我会什么！";
	}
	
}









