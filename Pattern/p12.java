public class p12 {
    public static void main(String[] args) {
        int n = 11;
        int s = (2 * n) - 4;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");

                if(i <= n-1) {
                    for (int j = 1; j <= s; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    s -= 2;
                } 
            }

            System.out.println();
        }
    }
}
