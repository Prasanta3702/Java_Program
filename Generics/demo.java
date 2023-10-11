public class demo {
    public static void main(String[] args) {
        A<String> ob = new A("Welcome");
    }
}
class A<T> {
    T ob;

    public A(T ob) {
        this.ob = ob;
    }
}