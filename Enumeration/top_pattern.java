public class top_pattern {
    public static void main(String[] args) {
        int num = 10;
        int n = num / 2;
        int s = 2;
        int width = (2 * n) - 3;
        width *= 2;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n * 2; j++) {
                    System.out.print("* ");
                }
            }
            if (i > 1) {
                for (int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                s += 2;
                System.out.print("*");

                for (int j = 1; j <= width-1; j++) {
                    System.out.print(" ");
                }
                width -= 4;
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
