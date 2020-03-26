package Stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream反序列化对象的输入流<BR>
 * 即将磁盘上的文件转化进入内存
 * @author 李泽坤
 *
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception{
		//获取文件
		FileInputStream fis = new FileInputStream("person.obj");
		//输入流
		ObjectInputStream ois = new ObjectInputStream(fis);
		//读取字节，转换成对应对象
		Person p = (Person)ois.readObject();
		
		System.out.println("name:"+p.getName());
		System.out.println("age:"+p.getAge());;
		System.out.println("sex:"+p.getSex());
		
		ois.close();
	}
}
