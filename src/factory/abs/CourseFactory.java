package factory.abs;

/**
 * 抽象工厂模式的一个工厂生产一个产品族（有多个方法）
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
