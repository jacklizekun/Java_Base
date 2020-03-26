package ist;

/*
题目：
定义一个数组，用来存储3个Person对象。

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
 */
/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */

/**
 * 匿名类
 * @author 李泽坤
 *
 */
public class Demo01Array {

    public static void main(String[] args) {
        // 首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person1[] array = new Person1[3];

        Person1 one = new Person1("迪丽热巴", 18);
        Person1 two = new Person1("古力娜扎", 28);
        Person1 three = new Person1("玛尔扎哈", 38);

        // 将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println(array[1].getName()); // 古力娜扎
    }

}
