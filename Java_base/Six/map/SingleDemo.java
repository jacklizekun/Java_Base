package map;
/**
 * Singleton单例模式
 * @author 李泽坤
 *
 */
public class SingleDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getStringleton();
		Singleton s2 = Singleton.getStringleton();
		Singleton s3 = Singleton.getStringleton();
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
	}
}	
