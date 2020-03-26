package Algorithm;
/**
 * 练习
 * @author 李泽坤
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		Cell c1 = new Cell();
		c1.row = 0;
		c1.col = 3;//f g b
		c1.color = 0xff0000;//红色
		
		Cell c2 = new Cell();
		c2.row = 4;
		c2.col = 3;
		c2.color = 0xffff00;//黄色
		System.out.println(c2.col);//3
	}
}
	
	/**格子类型，规定了格子的数据结构，
	 * 每个格子都有自己的行列和颜色*/
	class Cell{
		int row;//是对象的属性，是实例变量，每个对象一份
		int col;
		int color;
	}
