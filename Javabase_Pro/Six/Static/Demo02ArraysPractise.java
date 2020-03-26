package Static;

import java.util.Arrays;

/**
 * 字符串中字符升序排列
 * @author 李泽坤
 *
 */
public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";

        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // 对字符数组进行升序排列

        // 需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

}
