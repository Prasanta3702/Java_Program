public class Circle {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (i == n / 2) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            }
            if (i != n / 2 && i < n) {
                for (int j = 1; j <= n * 2; j++) {

                    if (j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
