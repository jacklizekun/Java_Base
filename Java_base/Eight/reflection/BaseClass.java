package reflection;

/**
 * 多态
 * 
 * @author 李泽坤
 * 
 */
public class BaseClass {
	int id;
	private String name;
	protected double score;
	public double grade;

	public BaseClass() {
	}

	public BaseClass(int id, String name, double score, double grade) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.grade = grade;
	}

	public void fun1() {
		System.out.println("无返回，无参数");
	}

	public String fun2(int a, String b) {
		return this.name + " " + a + " " + b;
	}

	public void printInfo() {
		System.out.println(this.id + " " + this.name + " " + this.score + " "
				+ this.grade);
	}

}
