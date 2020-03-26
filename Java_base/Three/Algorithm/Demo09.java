package Algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 李泽坤
 * 练习：
 * 实现生成双色球彩票号码算法
 * 
 * 实现方法 返回彩票号码 如[03,06,08,12,15,23,08]
 * 
 * 1)生成红球号码
 * 	数据 红球：“01”～“33”
 * 	使用标记:f,f,...
 * 	红球号：{^,^,^,^,^,^}
 * 	index = 0 生成号码的个数
 * 2）生成蓝色球号码
 */
public class Demo09 {
	public static void main(String[] args) {
		String[] balls = gen();
		System.out.println(Arrays.toString(balls));
	}
	public static String[] gen() {
		String[] pool = {"01","02","03","04","05","06",
						 "07","08","09","10","11","12",
						 "13","14","15","16","17","18",
						 "19","20","21","22","23","24",
						 "25","26","27","28","29","30",
						 "31","32","33"};
		boolean[] used = new boolean[pool.length];
		String[] balls = new String[6];
		int index = 0;
		Random r = new Random();
		do {
			int i = r.nextInt(pool.length);
			if (used[i]) {
				continue;
			}
			balls[index++] = pool[i];
			used[i] = true;
		} while (index != balls.length);
		Arrays.sort(balls);
		balls = Arrays.copyOf(balls, balls.length+1);
		balls[balls.length-1] = pool[r.nextInt(16)];
		
		
		
		return balls;
	}
}
