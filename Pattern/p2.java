public class p2 {
    public static void main(String[] args) {
        //System.out.println("\033[H\033[2J");


        int n = 12;
        int s = 1;
        int s2 = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            
            if (i > 2) {
                if(i == n) {
                    for(int j = 1; j <= n-1; j++) {
                        
                        System.out.print(" *");
                    }
                }
                else {

                    for(int j = 1; j <= s; j++) {
                        System.out.print(" ");
                    }
                    s++;
                    
                    System.out.print("*");
                    
                }
            }

            if(i > 1 && i < 3) {
                for(int j = 1; j <= s2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

          
            if(i > 2 && i < n) {
                for(int j = 1; j <= s2; j++) {
                    System.out.print(" ");
                }
                s2++;
               
                System.out.print("*");
            }

            System.out.println();
        }

        n--;
        s = (2 * n) - 3;
        s2 = (n - 2);
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i < n-1) {
                for(int j = 1; j <= n-(i+1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i >= n-1) {
                System.out.print(" ");
            }
            if(i < n) {
                
                for(int j = 1; j <= s2; j++) {
                    System.out.print(" ");
                }
                s2--;
                System.out.print("*");
            }
            
            System.out.println();
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException exc){
            System.out.println(exc);
        }

    }
}
