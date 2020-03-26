package Time;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器简单应用
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Timer timer = new Timer();
		//每次间隔一定时间运行
		timer.schedule(new DemoTask(), 0, 1000/24);

	}

}

class DemoTask extends TimerTask{
	String[] ary = {
		">          <",
		">>        <<",//0
		" >>      << ",//1
		"  >>    <<  ",//2
	    "   >>  <<   ",//3
	    "    >><<    ",//4
	    "     ><     ",
	    "    >><<    ",//5
	    "   >>  <<   ",
	    "  >>    <<  ",
	    " >>      << ",
	    ">>        <<",
	    ">          <",
	    
	    };//6
	int i = 0;
	@Override
	public void run() {
		i++;
		String s = ary[i%ary.length];
		//每次执行run方法会周期性的输出数组中的每个字符串
		System.out.println(s);	
	}
}