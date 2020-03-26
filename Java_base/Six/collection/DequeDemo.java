package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * @author 李泽坤
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		//java.util.Deque
		Deque<String> deque = new LinkedList<String>();
		
		deque.push("A");
		deque.push("B");
		deque.push("C");
		deque.push("D");
		deque.push("E");
		deque.push("F");
		
		System.out.println(deque);
		
		// 遍历栈结构

		while(deque.peek() != null){
			String de = deque.pop();
			System.out.println(de);
		}
		
		System.out.println(deque);
		
		
		
		
		
		
		
		
		
		
		
	}
}
