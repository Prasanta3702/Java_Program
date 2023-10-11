import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String description();
}

@MyAnno(str = "My Annotation in class", val = 200)
@MyAnno2(description = "MyAnnotation2 in class")
class allAnnotation {

    @MyAnno (str = "MyAnnotation", val = 100)
    @MyAnno2 (description = "Another annotation")

    public static void myMeth() {
        allAnnotation ob = new allAnnotation();

       try {
            // find the all annotation in classes
            Annotation[] anno = ob.getClass().getAnnotations();
            System.out.println("All classes annotation is: ");
            for(var i : anno) {
                System.out.println(i.toString());
            }
            System.out.println();

            // find the all annotation in method
            Method m = ob.getClass().getMethod("myMeth");
            anno = m.getAnnotations();
            System.out.println("All method annotations is : ");
            for(var i : anno) {
                System.out.println(i.toString());
            }
        }
        catch (NoSuchMethodException exc) {
            System.out.println("No such method found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}