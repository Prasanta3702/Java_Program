public class zero {
    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");

        int n = 10;

        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                for(int j = 1; j <= n/2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.print("*");
            
            if (i > 1 && i < n) {
                for(int j = 1; j <= n-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i == n) {
                for(int j = 1; j <= n / 2; j++) {
                    System.out.print(" *");
                }
            }

            System.out.println();
        }
        System.out.println();
    }
}