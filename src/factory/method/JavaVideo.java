package factory.method;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java课程视频");
    }
}
