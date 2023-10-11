interface Beta {
    static void hello() {
        System.out.println("Hello");
    }
}
class MyClass implements Beta {
   
}
public class p1 {
    public static void main(String[] args) {
        Beta.hello();
    }
}