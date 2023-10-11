interface lambdaDemo {
    boolean Test (String str, String s);
}
public class p1 {
    public static void main(String[] args) {
        String str = "welcome to code with prasanta";

        lambdaDemo l = (x, y) -> x.indexOf(y) != -1;

        if(l.Test())
    }
}   