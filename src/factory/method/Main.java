package factory.method;

/**
 * 工厂方法模式（多态工厂模式）相对于简单工厂模式：
 *      工厂变成了抽象工厂，需要具体工厂的继承覆写了，通过具体工厂创建实例；
 *      优点：增加Video产品时不需要修改原产品类和工厂类了，只需添加具体产品类和具体工厂类；
 *            向客户隐藏了那些具体的方法被实例化；
 *            工厂确定创建何种产品对象，客户不关心；
 *            加入新产品时无需修改抽象工厂和抽象产品提供的接口（可拓展性）。
 *      缺点：添加新产品时需要编写新产品和实现工厂，系统中类的数量将成对增加，增加了系统的复杂度，编译数等额外开销；
 *            抽象导致的理解难度和阅读难度；
 */
public class Main {
    public static void main(String[] args) throws Exception{
        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        JavaScriptVideoFactory javaScriptVideoFactory = new JavaScriptVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        Video javaScriptVideo = javaScriptVideoFactory.getVideo();
        javaVideo.produce();
        javaScriptVideo.produce();

        //反射方式加载
        String factoryName = "factory.method.JavaVideoFactory";
        Class<?> c = Class.forName(factoryName);
        VideoFactory videoFactory = (VideoFactory) Class.forName(factoryName).newInstance();
        videoFactory.getVideo().produce();
    }
}
