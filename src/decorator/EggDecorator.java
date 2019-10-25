package decorator;

/**
 * 具体装饰者——鸡蛋装饰器    加一个蛋
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABetterCake aBetterCake) {
        super(aBetterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;//加一块钱
    }

    public void egg() {
        System.out.println("加一个鸡蛋");
    }
}
