import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class AnnotationDemo {
    
    @MyAnno (str = "Annotation Example", val = 100)
    public static void myMeth() {

        // step 1 find the class object that represent class
        AnnotationDemo ob = new AnnotationDemo();
        
        try {
            // find the class whose inside the annotation have using object
            Class<?> c = ob.getClass();
            // find the method where the annotation are link using class reference
            Method m = c.getMethod("myMeth");
            // find the annotation and create the reference
            MyAnno anno = m.getAnnotation(MyAnno.class);
            // display the member of annotation
            System.out.println(anno.str()+" "+anno.val());
        }
        catch (NoSuchMethodException exc) {
            System.out.println("Method could not found");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}