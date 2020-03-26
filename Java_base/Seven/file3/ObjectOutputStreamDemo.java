package file3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream
 * @author 李泽坤
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		Point p = new Point(1,2);
		FileOutputStream fos = new FileOutputStream("point.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		
//		//将对象反序列化
//		FileInputStream fis = 
//			new FileInputStream("point.obj");
//		
//		ObjectInputStream ois = 
//			new ObjectInputStream(fis);
//		
//		Point p1 = (Point)ois.readObject();
//		
//		System.out.println("是同一个对象么?"+(p==p1));
//		System.out.println("p:"+p);
//		System.out.println("p1:"+p1);
//		
//		ois.close();
	}
}







