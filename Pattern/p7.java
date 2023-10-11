import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 9;
        int s = 1;
        System.out.println("Enter the row: ");
        n = sc.nextInt();        

        for(int i = 1; i <= n; i++) {
            // space 
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i > 1) {
                for(int j = 1; j <= s; j++) {
                    System.out.print(" ");
                }
                s += 2;
                System.out.print("*");
            }

            System.out.println();
        }

        n -= 1;
        s = (n * 2) - 3; // formula 

        for(int i = 1; i <= n; i++) {
            // space
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i < n) {
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