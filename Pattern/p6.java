public class p6 {
    public static void main(String[] args) {
        int n = 20;
        int s = (n * 2) - 3; // formula to width 

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i < n) {
                for(int j = 1; j <= s; j++)  {
                    System.out.print(" ");
                }
                s -= 2;
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
