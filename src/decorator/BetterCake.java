package decorator;

/**
 * 具体构件
 */
public class BetterCake extends ABetterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
