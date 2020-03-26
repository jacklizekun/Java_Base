package string;


/**
 * replaceAll()
 * @author 李泽坤
 *
 */
public class replaceAll {
	public static void main(String[] args) {
		String str = "33df4ASFS6464S55456ERWER54634S";
		

		String[] info = {"NND","SB","TMD","TNND","CNM"};
		String rex = "(";
		for (int i = 0; i < info.length; i++) {
			rex += info[i]+"|";
		}
		//rex +=")";
		rex +=( info[info.length-1] + ")");
		System.out.println(rex);
		str = "NND今天装备又被黑了，那个SB团长！";
		str = str.toUpperCase().replaceAll(rex, "***");
		//str = str.toUpperCase().replaceAll(rex, "***");
		
		System.out.println(str);
	}
}
