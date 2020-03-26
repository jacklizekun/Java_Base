package numberbase;
/**
 * 布尔值
 * @author 李泽坤
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		int age = 18;
		boolean isChild = age < 16;//false
		System.out.println(isChild);//false
		
		boolean used = true;//二手
		boolean pause = true;//暂停

		if (pause) {
			System.out.println("按［C］继续运行。。");
		}else {
			System.out.println("按［p］暂停");
		}
		
		if (used) {
			System.out.println("跳楼价，八折！");
		}
		
	}
}
