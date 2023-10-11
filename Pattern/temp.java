public class temp {
    static void TopPosition() {

        int n2 = 20;
        int n = n2 / 2;
        int s = 2;
        int w = (2 * n) - 3;
        w *= 2;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n2+1; j++) {
                    System.out.print("* ");
                }
            }
            if (i > 1) {
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                s += 2;
                System.out.print("*");

                if (i <= n) {
                    for (int j = 1; j <= w+1; j++) {
                        System.out.print(" ");
                    }
                    w -= 4;
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int j = 1; j <= n2; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
    }
}