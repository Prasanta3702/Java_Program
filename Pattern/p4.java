public class p4 {
    public static void main(String[] args) {
        int n = 16;

        // System.out.print("\033[H\033[2J");

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                for (int j = 1; j < n; j++) {
                    System.out.print("* ");
                }
            }
            if ((i > 1) && (i <= n - 1)) {

                // first line horizontally
                if (i == 6) {
                    for (int j = 1; j < n; j++) {
                        System.out.print("* ");
                    }
                } else if (i == 11) {
                    for (int j = 1; j < n; j++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 1; j <= (n * 2) - 4; j++) {
                        if (j == 1) {
                            System.out.print("*");
                        } else {
                            if (j == 11) {
                                System.out.print("*");
                            } else if (j == 20) {
                                System.out.print("*");
                            }

                            System.out.print(" ");
                        }
                    }
                }

            }

            // right side
            System.out.print("* ");

            // bottom line
            if (i == n) {
                for (int j = 1; j <= n - 1; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }
}