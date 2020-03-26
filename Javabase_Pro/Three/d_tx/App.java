package d_tx;

import org.junit.Test;
/**
 * 
 * @author 李泽坤
 *
 */
public class App {

	@Test
	public void testname() throws Exception {
		
		// 转账
		AccountDao accountDao = new AccountDao();
		accountDao.trans();
	}
}
