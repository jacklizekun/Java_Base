package date;

/**
 * StringBuilder
 * @author 李泽坤
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "努力学习Java，为了编出好程序!!!";
		//创建StringBuilder用于修改字符串
		StringBuilder builder = new StringBuilder(str);
		System.out.println(builder);
		
		//向字符串末尾追加一个字符串“!!!”
		builder.append("!");
		System.out.println(builder);
		//获取StringBuilder修改后的字符串
		String str1 = builder.toString();
		System.out.println(str1);
		
		/*
		 * 向字符串给定位置插入新内容
		 * builder.insert(offset,b)
		 * 参数1：指定字符串位置索引，从0开始
		 * 参数2：插入的顺序
		 */
		builder.insert(9, "就是");		
		System.out.println(builder);
		
		/*
		 * builder.replace(start,end,str1)
		 * 修改字符串
		 * 参数1：被替换内容的起始位置
		 * 参数2：被替换内容的结束位置
		 * 参数3：替换的内容
		 * 
		 */
		builder.replace(0, 8, "活着");
		System.out.println(builder);
		
		/*
		 * delete(int start,int end)
		 * 删除字符串中的部分内容
		 * 参数1：要删除的起始位置
		 * 参数2：要删除的结束位置
		 * 
		 */
		//返回值StringBuilder的实例
		builder.delete(7,builder.length())
			   .append("改变世界！")
			   .insert(9,"似的黑粉菌");
		System.out.println(builder);

		//字符串反转
		builder.reverse();
		System.out.println(builder);
		
	}
}
