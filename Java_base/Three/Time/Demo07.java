package Time;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 键盘事件监听器KeyListener接口
 * @author 李泽坤
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		KeyTester keyTester = new KeyTester();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		panel.addKeyListener(keyTester);
		//插接keyTester到面板上，
		panel.requestFocus();//请求键盘输入焦点
		}
}

//继承KeyAdapter就是实现
class KeyTester implements KeyListener{
	//按键敲击时候执行
	public void keyTyped(KeyEvent e) {
		System.out.println("Type:"+e.getKeyCode());
	}

	//按键按下时候执行
	public void keyPressed(KeyEvent e) {
		System.out.println("Press:"+e.getKeyCode());
	}

	//按键放下时候执行
	public void keyReleased(KeyEvent e) {
		System.out.println("Released:"+e.getKeyCode());
	}
}