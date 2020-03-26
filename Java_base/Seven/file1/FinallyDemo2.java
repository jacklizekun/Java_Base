package file1;
/**
 * finally
 * @author 李泽坤
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(test(null)+","+test("0")+","+test(""));
		/**
		 * 输出的四个选项：
		 * A:0,0,5 B:1,0,2 C:4,0,5 D:4,4,4
		 */
	}
	
	@SuppressWarnings("finally")
	public static int test(String str){
		try{
			return str.charAt(0) - '0';
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e){
			return 2;
		}catch(Exception e){
			return 3;
		}finally{
			//实际情况中finally中不应该含有return语句
			return 4;
		}
	}
}

