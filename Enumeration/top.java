public class top {
    public static void Top() {
        System.out.println("\033[H\033[2J");

        System.out.println("\n\n\n");

        int n = 20;
        int s;
        for (int i = 1; i <= n/2; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            s = n - i;
            for (int j = 1; j <= s - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("\n\n\n");
        System.out.println("\n\n\n");
        System.out.println("\n\n\n");
        System.out.println("\n");
    }
}
