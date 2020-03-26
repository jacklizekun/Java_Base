package c_auto;

import org.junit.Test;
/**
 * JDBC自动保存
 * @author 李泽坤
 *
 */
public class App {

	// 保存员工
	@Test
	public void testSave() throws Exception {
		// 模拟数据
		Dept d = new Dept();
		d.setDeptName("应用开发部");
		Employee emp = new Employee();
		emp.setEmpName("李俊杰");
		emp.setDept(d);   // 关联
		
		// 调用dao保存
		EmpDao empDao = new EmpDao();
		empDao.save(emp);
		
	}
}
