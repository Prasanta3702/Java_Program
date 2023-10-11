public class p11 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int n = 19;
        int mid = n / 2;
        mid += 1;
        int s = 1;

        for (int i = 1; i <= n; i++) {

            if (i <= mid) {

                for (int j = 1; j <= mid - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i > 1) {
                    for (int j = 1; j <= s; j++) {
                        System.out.print("*");
                    }
                    s += 2;
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= (i - mid); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i <= n - 1) {
                    s -= 2;
                    for (int j = 1; j <= s - 2; j++) {
                        System.out.print("*");
                    }
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
