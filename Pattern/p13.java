public class p13 {
    public static void main(String[] args) {
        int n = 10;
        int s = 1;
        
        for(int i = 1; i <= n; i++) {
            if(i == n) {
                for(int j = 1; j <= n-1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.print("*");

            if(i > 1 && i <= n-1) {
                for(int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                s+=2;
            }

            System.out.println();
        }
    }
}
