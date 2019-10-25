package decorator;

/**
 * 抽象装饰者
 */
public abstract class AbstractDecorator extends ABetterCake{

    private ABetterCake aBetterCake;

    public AbstractDecorator(ABetterCake aBetterCake) {
        this.aBetterCake = aBetterCake;
    }

    //抽象装置者自定义的方法
    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBetterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBetterCake.cost();
    }
}
