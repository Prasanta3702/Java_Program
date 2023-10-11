import java.lang.annotation.*;
import java.lang.reflect.*;

@Repeatable(RepeatableDemo.class)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface RepeatableDemo {
    MyAnno[] value();
}

public class Repeating_Annotation {
    @MyAnno(str = "Repeatable 1", val = 100)
    @MyAnno(str = "Repeatable 2", val = 200)
    public static void show() {
        Repeating_Annotation ob = new Repeating_Annotation();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("show");
            Annotation anno = m.getAnnotation(RepeatableDemo.class);
            System.out.println(anno);
        }
        catch (NoSuchMethodException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }
    public static void main(String[] args) {
        show();
    }
}
