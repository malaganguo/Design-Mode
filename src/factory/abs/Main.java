package factory.abs;

/**
 * 抽象工厂模式
 *      抽象工厂提供一个产品族，
 *      客户端指定具体工厂就可以获取该工厂的产品族
 *      通过不同的工厂实现类进行实例化
 *      通过反射和配置文件可以实现修改具体工厂时不修改客户端代码，只改配置文件
 */
public class Main {
    public static void main(String[] args) throws Exception{
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        Article article = javaCourseFactory.getArticle();
        Video video = javaCourseFactory.getVideo();
        article.produce();
        video.produce();

        System.out.println("-------------------------");

        JavaScriptCourseFactory javaScriptCourseFactory = new JavaScriptCourseFactory();
        Article article1 = javaScriptCourseFactory.getArticle();
        Video video1 = javaScriptCourseFactory.getVideo();
        article1.produce();
        video1.produce();

        System.out.println("-------------------------");

        String factoryName = "factory.abs.JavaCourseFactory";
        refCreateFactory(factoryName);

        System.out.println("-------------------------");
        String factoryName1 = "factory.abs.JavaScriptCourseFactory";
        refCreateFactory(factoryName1);

    }

    private static void refCreateFactory(String factoryName) throws Exception{
        Class<?> c = Class.forName(factoryName);
        CourseFactory courseFactory = (CourseFactory) c.newInstance();
        courseFactory.getArticle().produce();
        courseFactory.getVideo().produce();
    }
}
