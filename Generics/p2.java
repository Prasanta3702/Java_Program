class Gen<T, V> {
    T ob;
    V ob2;

    Gen(T o, V o2) {
        this.ob = o;
        this.ob2 = o2;
    }
    public T getOb() {
        return ob;
    }
    public V getOb2() {
        return ob2;
    }
    public void showType() {
        System.out.println("Type is: "+ob.getClass().getName());
        System.out.println("Type is: "+ob2.getClass().getName());
    }
}
public class p2 {
    public static void main(String[] args) {
        Gen<Integer, String> isob = new Gen<Integer, String>(88, "Prasanta");

        isob.showType();
        System.out.println("Value is: "+isob.getOb());
        System.out.println("Value is: "+isob.getOb2());
    }
}
