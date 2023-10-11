public class p5 {
    public static void main(String[] args) {
        int n = 20;
        int s = 1;// for step 2 

        for(int i = 1; i <= n; i++) {
            

            // space 
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            // for start in 2nd row
            if(i > 1) {
                for(int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                s += 2;// increase space 
            }

            System.out.println();
        }
    }
}
