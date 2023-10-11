public class right {
    public static void Right() {

        System.out.println("\033[H\033[2J");

        System.out.println("\n\n\n");

        int n2 = 20;

        int n = n2/2;

        for (int i = 1; i <= n; i++) {
           
                for (int j = 1; j <= n*2-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            
            System.out.println();
        }
        for(int i= 1; i <= n; i++){

            for(int j = 1; j <= i+n; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        System.out.println("\n\n\n");
    }
}
