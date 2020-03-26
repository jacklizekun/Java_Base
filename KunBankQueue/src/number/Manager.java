package number;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	//最后的数量
	private int lastNumber = 0;
	//排队
	private List queueNumbers = new ArrayList();
	//排队的数量不断增加
	public synchronized Integer generateNewNumber(){
		queueNumbers.add(++lastNumber);
		return lastNumber;
	}
	//获取目前的数量
	public synchronized Integer fetchNumber(){
		if(queueNumbers.size()>0){
			return (Integer)queueNumbers.remove(0);
		}else{
			return null;
		}
	}
}
