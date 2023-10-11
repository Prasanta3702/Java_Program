public class temp {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int n = 15;
        int s = 1;
        int s2 = (2 * n) - 3;
        s2 = s2 / 2;
        s2++;

        for (int i = 1; i <= n; i++) {
            if(i == 1) {
                for(int j = 1; j <= s2; j++) {
                    System.out.print("*");
                }
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                s += 2;
                s2--;
                for(int j = 1; j <= s2; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
        n--;
        s = (n * 2) - 3;
        s2 = 1;
        for (int i = 1; i <= n; i++) {
            if(i == n) {
                for(int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("*");

            if (i <= n - 1) {
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                s -= 2;
                for(int j = 1; j <= s2; j++) {
                    System.out.print("*");
                }
                s2 += 1;
            }
            System.out.println();
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }
}