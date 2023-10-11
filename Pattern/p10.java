public class p10 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        int n = 10;
        int s = 1;

        for(int i = 1; i <= n; i++) {
            if(i == n) {
                for(int j = 1; j <= (2*n)-2; j++) {
                    System.out.print("*");
                }
            }
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i > 1 && i <= n-1) {
                for(int j = 1; j <= s; j++) {
                    System.out.print("*");
                }
                System.out.print("*");
                s+=2;
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
