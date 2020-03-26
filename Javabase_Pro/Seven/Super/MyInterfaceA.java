package Super;

/**
 * 
 * @author 李泽坤
 *
 */
public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("AAA");
    }

	void methodAbs();

}
