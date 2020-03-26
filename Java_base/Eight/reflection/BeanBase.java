package reflection;
/**
 * javabean类
 * @author 李泽坤
 *
 */
public class BeanBase {
	/*
	 * POJO类
	 */
	private int id;
	private String name;
	private double score;
	
	public BeanBase() {
	}
	public BeanBase(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
