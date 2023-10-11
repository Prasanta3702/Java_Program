class Gen<T> {
    T ob;

    Gen(T o) {
        this.ob = o;
    }
    public T getOb() {
        return ob;
    }
    public void showType() {
        System.out.println("Type is: "+ob.getClass().getName());
    }
}
public class p1 {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<Integer>(5);

        iob.showType();
        System.out.println("value is: "+iob.getOb());

        Gen<String> sob = new Gen<String>("Welcome");
        sob.showType();
        System.out.println("Value is: "+sob.getOb());
    }
}