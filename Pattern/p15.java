public class p15 {
    public static void main(String[] args) {
        int n = 15;
        int mid = (n / 2) + 1;
        int s = mid - 1;
        int s2 = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print("*");

            if (i > 1 && i <= mid) {
                
                for (int j = 1; j <= s2; j++) {
                    System.out.print(" ");
                }
                s2 += 1;
                System.out.print("*");
                

            } else {
                
                if (i > 1 && i <= n - 1) {
                    for (int j = 1; j <= s-1; j++) {
                        System.out.print(" ");
                    }
                    s--;
                    System.out.print("*");
                }
                
            }

            System.out.println();
        }
    }
}
