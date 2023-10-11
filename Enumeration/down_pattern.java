public class down_pattern {
    public static void main(String[] args) {
        int n = 20;
        int mid = n / 2;
        int width = (2 * mid) - 3;
        int width2 = 2;

        for (int i = 1; i <= mid; i++) {
            for(int j = 1; j <= width+1; j++) {
                System.out.print(" ");
            }
            width -= 2;
            System.out.print("*");
            if(i > 1) {
                for(int j = 1; j <= width2+1; j++) {
                    System.out.print(" ");
                }
                width2 += 4;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
