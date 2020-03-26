package clazz;
/**
 * 对象
 * @author 李泽坤
 *
 */
public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "王健林";
        person.sayHello("王思聪");

        System.out.println(person); // 地址值
    }

}
