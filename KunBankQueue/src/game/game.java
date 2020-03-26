package game;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import Custom.CustomerType;
import constantsTIME.Constants;
import number.Machine;
import service.ServiceWindow;
/**
 * 多线程银行业务模拟
 * @author 李泽坤
 *
 */
public class game {
	//日志
	private static Logger logger = Logger.getLogger("KUNbankqueue");
	//主程序
	public static void main(String[] args) {
		//产生4个servicewindow的对象实例
		for(int i=1;i<5;i++){
			ServiceWindow window =  new ServiceWindow();
			//设置window序号
			window.setNumber(i);
			//开始普通客户业务
			window.start();
		}
	
		//产生1个快速窗口实例
		ServiceWindow expressWindow =  new ServiceWindow();
		//快速客户实例
		expressWindow.setType(CustomerType.EXPRESS);
		//开始快速客户业务
		expressWindow.start();
		
		//产生1个VIP窗口	实例	
		ServiceWindow vipWindow =  new ServiceWindow();
		//VIP客户实例
		vipWindow.setType(CustomerType.VIP);
		//开始VIP客户业务
		vipWindow.start();		
		
		//普通客户拿号
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				new Runnable(){
					public void run(){
						Integer serviceNumber = Machine.getInstance().getCommonManager().generateNewNumber();
						System.out.println("第" + serviceNumber + "号普通客户正在等待服务！");						
					}},0,Constants.COMMON_CUSTOMER_INTERVAL_TIME, TimeUnit.SECONDS);
		
		//快速客户拿号
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				new Runnable(){
					public void run(){
						Integer serviceNumber = Machine.getInstance().getExpressManager().generateNewNumber();
						System.out.println("第" + serviceNumber + "号快速客户正在等待服务！");
					}
				},
				0,
				Constants.COMMON_CUSTOMER_INTERVAL_TIME * 2, 
				TimeUnit.SECONDS);
		
		//VIP客户拿号
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				new Runnable(){
					public void run(){
						Integer serviceNumber = Machine.getInstance().getVipManager().generateNewNumber();
						System.out.println("第" + serviceNumber + "号VIP客户正在等待服务！");
					}
				},
				0,
				Constants.COMMON_CUSTOMER_INTERVAL_TIME * 6, 
				TimeUnit.SECONDS);
	}

}
