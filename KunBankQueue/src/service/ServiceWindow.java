package service;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import number.*;
import constantsTIME.*;
import Custom.CustomerType;

public class ServiceWindow {
	
	private static Logger logger = Logger.getLogger("KUNbankqueue");
	private CustomerType type = CustomerType.COMMON;
	private int number = 1;
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	public void setNumber(int number){
		this.number = number;
	}
	
	public void start(){
		Executors.newSingleThreadExecutor().execute(
				new Runnable(){
					public void run(){
						while(true){
							switch(type){
								case COMMON:commonService();break;
								case EXPRESS:expressService();break;
								case VIP:vipService();break;
							}
						}
					}
				}
		);
	}
	//普通业务
	private void commonService(){
		String windowName = "第" + number + "号" + type + "窗口";		
		System.out.println(windowName + "开始普通任务!");
		Integer serviceNumber = Machine.getInstance().getCommonManager().fetchNumber();		
		if(serviceNumber != null ){
			System.out.println(windowName + "开始为第" + serviceNumber + "号普通客户服务");		
			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
			int serviceTime = new Random().nextInt(maxRandom)+1 + Constants.MIN_SERVICE_TIME;
	
			try {
				Thread.sleep(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			System.out.println(windowName + "完成为第" + serviceNumber + "号普通客户服务，总共耗时" + serviceTime/1000 + "秒");		
		}else{
			System.out.println(windowName + "没有取到普通任务，正在空闲一秒");		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}
	}
	
	private void expressService(){
		Integer serviceNumber = Machine.getInstance().getExpressManager().fetchNumber();
		String windowName = "第" + number + "号" + type + "窗口";	
		System.out.println(windowName + "开始获取快速任务!");		
		if(serviceNumber !=null){
			System.out.println(windowName + "开始为第" + serviceNumber + "号快速客户服务");			
			int serviceTime = Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			System.out.println(windowName + "完成为第" + serviceNumber + "号快速客户服务，总共耗时" + serviceTime/1000 + "秒");		
		}else{
			System.out.println(windowName + "没有取到快速任务！");				
			commonService();
		}
	}
	
	private void vipService(){

		Integer serviceNumber = Machine.getInstance().getVipManager().fetchNumber();
		String windowName = "第" + number + "号" + type + "窗口";	
		System.out.println(windowName + "开始获取VIP任务!");			
		if(serviceNumber !=null){
			System.out.println(windowName + "开始为第" + serviceNumber + "号VIP客户服务");			
			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
			int serviceTime = new Random().nextInt(maxRandom)+1 + Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			System.out.println(windowName + "完成为第" + serviceNumber + "号VIP客户服务，总共耗时" + serviceTime/1000 + "秒");		
		}else{
			System.out.println(windowName + "没有取到VIP任务！");				
			commonService();
		}	
	}
}
