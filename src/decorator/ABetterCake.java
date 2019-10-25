package decorator;

/**
 * 抽象构件   是具体构件和抽象装饰类的共同父类
 */
public abstract class ABetterCake {

    protected abstract String getDesc();

    protected abstract int cost();
}
