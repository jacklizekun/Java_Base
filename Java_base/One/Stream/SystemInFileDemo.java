package Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 输出流
 * @author 李泽坤
 */
public class SystemInFileDemo {
	public static void main(String[] args) throws Exception{
		InputStream in = System.in;
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test.txt")));
		String str = null;
		while((str = reader.readLine()) != null){
			str = str.trim();
			if(!("exit".equals(str))){
				writer.write(str);
				writer.newLine();
			}else{
				break;
			}	
		}
		reader.close();
		writer.close();
	}
}
