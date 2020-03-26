package Stream;

import java.io.Serializable;

/**
 * 实现serializable接口的可以序列化的类
 * @author 李泽坤
 *
 */
public class Person implements Serializable{
	/**
	 *  该常量用于记录当前类型的版本，用于得知需要反序列化的
	 * 对象和当前类的版本是否一致，不一致就会导致反序列化失败，每当我们修改了
	 * 当前类的内容时版本号也应该随之改变。
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	/**
	 * ransient修饰的属性，在序列化时会被忽略
	 */
	//	private transient int sex;
	private int sex;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}
	public Person(int age, String name, int sex) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
}
