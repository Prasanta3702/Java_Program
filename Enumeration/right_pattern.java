public class right_pattern {
    public static void main(String[] args) {
        int n = 10;
        int mid = n / 2;
        mid += 1;
        int s = 1;
        int s2 = 1;

        int width = (2 * mid) - 3;
        width += 1;

        for(int i = 1; i <= mid; i++) {

            for(int j = 1; j <= width; j++) {
                System.out.print(" ");
            }
            width -= 2;
            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= s2; j++) {
                    System.out.print(" ");
                }
                s2 += 2;
                System.out.print("*");
            }

            System.out.println();
        }
        s2 -= 2;
        for(int i = 1; i <= mid - 1; i++) {

            for(int j = 1; j <= s+1; j++) {
                System.out.print(" ");
            }
            s += 2;
            System.out.print("*");

            if (i <= mid-2) {
                s2 -= 2;
                for(int j = 1; j <= s2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                System.out.println();
            }
        }
        
    }
}

