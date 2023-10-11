public class p14 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int n = 17;

        if(n % 2 == 0) {
            System.out.println("Please input odd Number");
            return;
        }
        int mid = n / 2;
        mid += 1;
        int s = 1;
        int width = (mid * 2) - 3;
        width *= 2;
        int s2 = 1;
        int s3 = 2;
        int width2 = (2 * mid) - 3;
        width2 -= 2;

        for (int i = 1; i <= n; i++) {

            if (i <= mid) {
                System.out.print("*");

                if (i > 1) {
                    for (int j = 1; j <= s; j++) {
                        System.out.print(" ");
                    }
                    s += 2;
                    System.out.print("*");
                }

                if (i <= mid - 1) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print(" ");
                    }
                    width -= 4;
                    System.out.print(" *");
                }

                if(i > 1) {
                    for(int j = 1; j <= s2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    s2 += 2;
                }


            } else {
                System.out.print("*");

                if (i <= n-1) {
                    s -= 2;
                    for(int j = 1; j <= s-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
               
                for(int j = 1; j <= s3; j++) {
                    System.out.print(" ");
                }
                System.out.print(" *");
                s3 += 4;
                
                if(i <= n-1) {
                    for(int j = 1; j <= width2; j++) {
                        System.out.print(" ");
                    }
                    width2 -= 2;
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
