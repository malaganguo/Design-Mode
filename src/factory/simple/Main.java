package factory.simple;

import java.util.Calendar;

/**
 * 简单工厂模式：
 *   抽象Video类接收produce方法；
 *   通过名字new对象；
 *   通过反射创建对象；
 */
public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo("java");
        java.produce();

        Video js = videoFactory.getVideo(JavaScriptVideo.class);
        js.produce();

        Calendar.getInstance();
    }
}
