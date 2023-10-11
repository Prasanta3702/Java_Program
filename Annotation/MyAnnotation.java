import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class MyAnnotation {
    @MyAnno(str = "MyAnnotation", val = 500)
    public static void myMeth(String str, int val) {
        MyAnnotation ob = new MyAnnotation();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str()+" "+anno.val());
        }
        catch(NoSuchMethodException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    }
    public static void main(String[] args) {
        myMeth("Text", 500);
    }
}