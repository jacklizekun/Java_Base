package e_longtext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import utils.JdbcUtil;
/**
 * setBinaryStream二进制数据
 * @author 李泽坤
 *
 */
public class App_blob {
	
	// 全局参数
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	

	@Test
	// 1. 二进制数据类型   ( 写longblob)
	public void testSaveText() {
		String sql = "insert into test(img) values(?)";
		try {
			// 连接
			con = JdbcUtil.getConnection();
			// pstmt 对象
			pstmt = con.prepareStatement(sql);
			// 获取图片流
			InputStream in = App_text.class.getResourceAsStream("7.jpg");
			pstmt.setBinaryStream(1, in);
			
			// 执行保存图片
			pstmt.execute();
			
			// 关闭
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(con, pstmt, null);
		}
	}
	
	@Test
	// 2. 读取大文本数据类型   ( 读longblob)
	public void testGetAsText() {
		String sql = "select img from  test where id=2;";
		try {
			// 连接
			con = JdbcUtil.getConnection();
			// pstmt 对象
			pstmt = con.prepareStatement(sql);
			// 读取
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// 获取图片流
				InputStream in = rs.getBinaryStream("img");
				// 图片输出流
				FileOutputStream out = new FileOutputStream(new File("c://1.jpg"));
				int len = -1;
				byte b[] = new byte[1024];
				while ((len = in.read(b)) != -1) {
					out.write(b, 0, len);
				}
				// 关闭
				out.close();
				in.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(con, pstmt, null);
		}
	}
}
