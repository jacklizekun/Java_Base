package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream用于序列化对象，即将内存中对象转换成字节
 * @author 李泽坤
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		Person p = new Person(16,"坤坤",1);
		//文件输出流，用于保存序列化对象后的字节
		FileOutputStream fos = new FileOutputStream("person.obj");
		//序列化输出流
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//对象转换成字节
		oos.writeObject(p);
		oos.close();
		//文件输入流
		FileInputStream fis = new FileInputStream("person.obj");
		//序列化输入流
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p1 = (Person)ois.readObject();
		ois.close();
		//序列化和反序列化生成的不是同一个对象，false
		System.out.println(p1 == p);
		//相等 true
		System.out.println(p1.equals(p));				
	}
}
