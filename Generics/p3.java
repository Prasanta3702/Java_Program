class Gen<T extends Number> {
    T[] ob;
    Gen(T[] o) {
        this.ob = o;
    }
    double average() {
        double sum= 0;
        for(int i = 0; i < ob.length; i++) {
            sum += ob[i].doubleValue();
        }
        return sum / ob.length;
    }
}
public class p3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Gen<Integer> iob = new Gen<Integer>(arr);
        System.out.println("Average is: "+iob.average());

        Double[] arr2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        Gen<Double> dob = new Gen<Double>(arr2);
        System.out.println("Average is: "+dob.average());

        Double d = 10.3;
        int v = d.intValue();
        System.out.println(v);
    }
}
