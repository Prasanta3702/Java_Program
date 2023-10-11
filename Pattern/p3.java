/*
 * 
 *  ONLINE 
 */

public class p3 {
    public static void main(String[] args) {
        int n, x, y, s = 1, k;

        n = 8;

        // top position

        for(x = 0; x <= n; x++) {

            for(y = n; y > x; y--) {
                System.out.print(" ");
            }

            System.out.print("*");

            

            if(x > 0) {
                for(k = 1; k <= s; k++) {
                    System.out.print(" ");
                }
                s += 2;
                System.out.print("*");
            }
            

            System.out.println(); 
        }
        
        

        s-= 4;
        for(x = 0; x <= n-1; x++) {
            for(y = 0; y <= x; y++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(k = 1; k <= s; k++) {
                System.out.print(" ");
            }
            s-=2;
            if(x != n-1) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}