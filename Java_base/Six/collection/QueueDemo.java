package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列queue.offer/poll
 * @author 李泽坤
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		//java.util.Queue
		Queue<String> queue = new LinkedList<String>();
		//队列中添加元素
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println(queue);
		

		//输出队首元素
		//peek()方法获取队首元素，但不会将其从队列中删除
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		
		String element;
		int k = queue.size();
		System.out.println(k);
		while((element = queue.poll()) != null) {
			System.out.println(element);
		}
		System.out.println(queue);
		
		
		
		
		
		
		
		
	} 
}
