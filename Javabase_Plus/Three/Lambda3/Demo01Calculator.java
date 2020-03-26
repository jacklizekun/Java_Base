package Lambda3;

/**
 * 
 * @author 李泽坤
 *
 */
public class Demo01Calculator {
    public static void main(String[] args) {
        //调用invokeCalc方法,方法的参数是一个接口,可以使用匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //使用Lambda表达式简化匿名内部类的书写
        invokeCalc(120,130,(int a,int b)->{
            return a + b;
        });

        //优化省略Lambda
        invokeCalc(120,130,(a,b)-> a + b);
    }

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
