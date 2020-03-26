package d_tx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

import utils.JdbcUtil;
/**
 * 手动提交和回滚事务
 * @author 李泽坤
 *
 */
public class AccountDao {

	// 全局参数
	private Connection con;
	private PreparedStatement pstmt;

	// 1. 转账，没有使用事务
	public void trans1() {

		String sql_zs = "UPDATE account SET money=money-1000 WHERE accountName='张三';";
		String sql_ls = "UPDATE account SET money=money+1000 WHERE accountName='李四';";

		try {
			con = JdbcUtil.getConnection(); // 默认开启的隐士事务
			con.setAutoCommit(true);

			pstmt = con.prepareStatement(sql_zs);
			pstmt.executeUpdate();

			pstmt = con.prepareStatement(sql_ls);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(con, pstmt, null);
		}

	}

	// 2. 转账，使用事务
	public void trans2() {

		String sql_zs = "UPDATE account SET money=money-1000 WHERE accountName='张三';";
		String sql_ls = "UPDATE1 account SET money=money+1000 WHERE accountName='李四';";

		try {
			con = JdbcUtil.getConnection(); // 默认开启的隐士事务
			// 一、设置事务为手动提交
			con.setAutoCommit(false);


			pstmt = con.prepareStatement(sql_zs);
			pstmt.executeUpdate();

		
			pstmt = con.prepareStatement(sql_ls);
			pstmt.executeUpdate();

		} catch (Exception e) {
			try {
				// 二、 出现异常，需要回滚事务
				con.rollback();
			} catch (SQLException e1) {
			}
			e.printStackTrace();
		} finally {
			try {
				// 三、所有的操作执行成功, 提交事务
				con.commit();
				JdbcUtil.closeAll(con, pstmt, null);
			} catch (SQLException e) {
			}
		}

	}

	// 3. 转账，使用事务， 回滚到指定的代码段
	public void trans() {
		// 定义个标记
		Savepoint sp = null;
		
		// 第一次转账
		String sql_zs1 = "UPDATE account SET money=money-1000 WHERE accountName='张三';";
		String sql_ls1 = "UPDATE account SET money=money+1000 WHERE accountName='李四';";
		
		// 第二次转账
		String sql_zs2 = "UPDATE account SET money=money-500 WHERE accountName='张三';";
		String sql_ls2 = "UPDATE1 account SET money=money+500 WHERE accountName='李四';";

		try {
			con = JdbcUtil.getConnection(); // 默认开启的隐士事务
			con.setAutoCommit(false);       // 设置事务手动提交

			pstmt = con.prepareStatement(sql_zs1);
			pstmt.executeUpdate();
			pstmt = con.prepareStatement(sql_ls1);
			pstmt.executeUpdate();
			
			// 回滚到这个位置？
			sp = con.setSavepoint(); 
			
	
			pstmt = con.prepareStatement(sql_zs2);
			pstmt.executeUpdate();
			pstmt = con.prepareStatement(sql_ls2);
			pstmt.executeUpdate();
			

		} catch (Exception e) {
			try {
				// 回滚 (回滚到指定的代码段)
				con.rollback(sp);
			} catch (SQLException e1) {
			}
			e.printStackTrace();
		} finally {
			try {
				// 提交
				con.commit();
			} catch (SQLException e) {
			}
			JdbcUtil.closeAll(con, pstmt, null);
		}

	}
}
