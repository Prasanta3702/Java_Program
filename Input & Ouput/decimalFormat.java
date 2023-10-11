/*
 * Formating a floating value using "printf()" method
 */

public class decimalFormat {
    public static void main(String[] args) {
        double x = 23.54231;

        // printf()
        System.out.printf("%.2f", x);

        System.out.println();

        // format()
        System.out.format("%.3f", x);
    }
}
