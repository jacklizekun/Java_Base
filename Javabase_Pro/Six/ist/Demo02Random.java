package ist;

import java.util.Random;

/**
 *  Random.nextInt
 * @author 李泽坤
 *
 */
public class Demo02Random {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10); // 范围实际上是0~9
            System.out.println(num);
        }
    }

}
