package array;

import java.util.Arrays;

/**
 *  数组的扩容与追加
 * @author 李泽坤
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		
		//扩容原理：更换新数组
		String[] playlist = {"坤坤","Poker Face"};
		System.out.println(Arrays.toString(playlist));
		playlist = new String[]{"坤坤","Poker Face","大帅哥"};
		System.out.println(Arrays.toString(playlist));
		
		//扩容
		playlist = Arrays.copyOf(playlist, playlist.length+1);
		playlist[playlist.length-1] = "橄榄树";
		System.out.println(Arrays.toString(playlist));
		
		//新建更大的数组并且复制
		String[] newOne = new String[playlist.length+1];
		System.arraycopy(playlist, 0, newOne, 0, playlist.length);
		playlist = newOne;
		System.out.println(Arrays.toString(playlist));
		
		
		
	}

}
