package numberbase1;
/**
 * 取余和自增算法
 * a++先取得a，再进++
 * ++a先++，后取得a
 * @author 李泽坤
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		int i = 0;
		//i先进行运算，再自增减
		System.out.println((i++) % 3);//(i++)=0 i=1 0%3 0
		System.out.println(i++ % 3);//(i++)=1 i=2 1%3 1
		System.out.println(i++ % 3);//(i++)=2 i=3 2%3 2 
		System.out.println(i++ % 3);//(i++)=3 i=4 3%3 0
		System.out.println(i++ % 3);//(i++)=4 i=5 4%3 1
		System.out.println(i++ % 3);//(i++)=5 i=6 5%3 2
		System.out.println(i++ % 3);//(i++)=6 i=7 6%3 0
		System.out.println(i++ % 3);//(i++)=7 i=8 7%3 1
		System.out.println(i++ % 3);//(i++)=8 i=9 8%3 2
		
		String[] players = {"孙俪","邓超","佟大为"};
		//						0	1		2
		String one = players[0];
		System.out.println(one);//孙俪
		i = 0;
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		
	}
}
