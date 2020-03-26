package Override;

/**
 * 
 * @author 李泽坤
 *
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

	@Override
	public void sleep() {
	
	}

}
