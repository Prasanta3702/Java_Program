public class p8 {
    public static void main(String[] args) {
        // System.out.print("\033[H\033[2J");
        int n = 10;

        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                for(int j = 1; j <= n-1; j++) {

                    if(j == 1) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            if(i > 1) {
                System.out.print("*");

                for(int j = 1; j <= n-1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j = 1; j <= n-1; j++) {
            if(j == 1) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
    }
}