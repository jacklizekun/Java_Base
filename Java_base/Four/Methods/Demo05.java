package Methods;

/**
 * final方法
 * @author 李泽坤
 *
 */
public class Demo05 {
	public static void main(String[] args) {
	
	}

}

class Super{
	public final void t1(){
		
	}
	public void t2(){
		
	}
}

class Sub extends Super{
	/*public void t1(){//编译错误，不能重写final方法
		
	}*/
	public void t2(){
		
	}
	
}