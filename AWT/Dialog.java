public class Dialog {
    public static void main(String[] args) {
        System.out.print("Loading: ");
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.print("\r");
        System.out.print("Loading: ");
        for(int i = 0; i < 10; i++) {
            System.out.print("#");
            try {
                Thread.sleep(200);
            } catch(InterruptedException exc) {
                
            }
        }
    }
}