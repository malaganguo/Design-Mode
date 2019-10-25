package decorator;

/**
 * 测试类
 */
public class Main {

    public static void main(String[] args) {
        ABetterCake aBetterCake = new BetterCake();
        System.out.println("老板,买一个"+aBetterCake.getDesc()+",花费："+aBetterCake.cost());

        aBetterCake = new EggDecorator(aBetterCake);
        System.out.println("老板,买一个"+aBetterCake.getDesc()+",花费："+aBetterCake.cost());

        aBetterCake = new SausageDecorator(aBetterCake);
        System.out.println("老板,买一个"+aBetterCake.getDesc()+",花费："+aBetterCake.cost());

        System.out.println("-----------------------");
        ABetterCake aBetterCake1 = new BetterCake();//新煎饼
        aBetterCake1 = new EggDecorator(aBetterCake1);//加一个蛋
        aBetterCake1 = new EggDecorator(aBetterCake1);//再加一个蛋
        System.out.println("老板,买一个"+aBetterCake1.getDesc()+",花费："+aBetterCake1.cost());
    }
}
