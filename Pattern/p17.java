public class p17 {
    public static void main(String[] args) {
        int n = 20;
        int mid = n / 2;
        mid += 1;
        int s = 1;

        for(int i = 1; i <= mid; i++) 
        {
            System.out.print("*");

            if (i > 1) {
                for(int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                s+=2;
                System.out.print("*");
            }

            System.out.println();
        }

        s -= 4;

        for(int i = 1; i <= mid - 1; i++) {
            System.out.print("*");

            if (i <= mid - 2) {

                for(int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                s -= 2;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}