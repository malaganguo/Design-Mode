package factory.simple;

public class VideoFactory {
    /**
     * 使用if else来返回对象
     * @param type
     * @return 返回的是工厂生产的对象
     */
    public Video getVideo(String type) {
        if("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }else if ("javaScript".equalsIgnoreCase(type)) {
            return new JavaScriptVideo();
        }
        return null;
    }

    /**
     * 反射创建对象
     * @param c 加载的字节码文件
     * @return 返回的是工厂生产的对象
     */
    public Video getVideo(Class c) {
        Video v = null;
        try {
             v =  (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return v;
    }
}
