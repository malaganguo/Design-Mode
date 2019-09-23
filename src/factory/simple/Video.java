package factory.simple;

/**
 *  抽象产品
 */
public abstract class Video {
    public abstract void produce();

    //也可以写所有产品的公共业务方法
    public void publicMethod() {
        System.out.println("公共特性方法");
    }
}
