package factory.abs;

public class JavaScriptCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaScriptVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaScriptArticle();
    }
}
