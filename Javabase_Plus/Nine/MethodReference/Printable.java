package MethodReference;

/**
 * 定义一个打印的函数式接口
 * @author 李泽坤
 *
 */
@FunctionalInterface
public interface Printable {
    //定义字符串的抽象方法
    void print(String s);
}
