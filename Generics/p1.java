class A<T> {
    T ob;

    A(T o) {
        this.ob = o;
    }
    public boolean isEquals(A o) {
        if(this.ob == o.ob) return true;
        else return false;
    }
}
public class p1 {
    public static void main(String[] args) {
        A<Integer> a = new A<Integer>(5);
        A<Double> b = new A<Double>(3.2);
        A<Integer> c = new A<Integer>(5);

        if(a.isEquals(b)) System.out.println("a and b is equals");
        else System.out.println("a and b is not equals");
        if(a.isEquals(c)) System.out.println("a and c is equals");
        else System.out.println("a and c is not equals");
    }
}