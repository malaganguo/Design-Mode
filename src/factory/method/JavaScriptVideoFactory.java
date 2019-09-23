package factory.method;

public class JavaScriptVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaScriptVideo();
    }
}
