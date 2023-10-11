public class process2 {
    public static void p2() {
        System.out.println("\033[H\033[2J");
        System.out.println("\n\n\n\n\n");
        int n = 10;

        int s = (2 * n) - 3;
        s -= 2;

        for (int i = 1; i <= n; i++) {
            if (i <= 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" *");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                if (i < n) {
                    for (int j = 1; j <= s; j++) {
                        if (j > 1 && j < s && i < n - 2)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    s -= 2;
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        n--;
        s = 1;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                for (int j = 1; j <= n + 1; j++) {
                    System.out.print(" *");
                }
            } else {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j = 1; j <= s; j++) {
                    if (i == n - 1 && j > 1 && j < s) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                s += 2;
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n\n\n\n");
    }
}
