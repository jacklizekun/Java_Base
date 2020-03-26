package Lambda;

/**
 * Runnable接口
 * @author 李泽坤
 *
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 新线程创建了");
    }
}
