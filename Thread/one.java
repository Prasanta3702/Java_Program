public class one {
    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");
        int n = 10;
        int w1 = n / 2;
        int s = 1;
        int s2 = 1;

        for(int i = 1; i <= n; i++) {

            if(i < w1) {
                for(int j = 1; j <= n-s; j++) {
                    System.out.print(" ");
                }
                s += 2;
                System.out.print("*");

                if(i > 1) {
                    for(int j = 1; j <= s-4; j++) {
                        System.out.print(" ");
                    }
                    s2 += 2;
                    System.out.print("*");
                }
            }
            else {
                if(i < n) {
                    for(int j = 1; j <= n-1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                else {
                    
                    for(int j = 1; j <= n-1; j++) {
                        System.out.print(" *");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}