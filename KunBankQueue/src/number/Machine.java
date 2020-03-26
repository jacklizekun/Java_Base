package number;

public class Machine {
	private Machine(){}
	//新建实例
	private static Machine instance = new Machine();
	public static Machine getInstance(){
		return instance;
	}
	//普通用户接待员
	private Manager commonManager = new Manager();
	//快速用户接待员
	private Manager expressManager = new Manager();
	//VIP接待员
	private Manager vipManager = new Manager();
	public Manager getCommonManager() {
		return commonManager;
	}
	public Manager getExpressManager() {
		return expressManager;
	}
	public Manager getVipManager() {
		return vipManager;
	}
	
}
