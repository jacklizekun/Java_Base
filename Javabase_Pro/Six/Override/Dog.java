package Override;

/**
 * 抽象类
 * @author 李泽坤
 *
 */
public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}
