package decorator;

/**
 * 香肠装饰类
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABetterCake aBetterCake) {
        super(aBetterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }//一个肠为啥两块？？？
}
