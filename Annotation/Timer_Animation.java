import animation.*;
class Animation implements Runnable {
    Thread thrd;
    
    Animation() {
        thrd = new Thread(this, "Animation");
    }
    public static Animation createAndStart() {
        Animation ob = new Animation();
        ob.thrd.start();
        return ob;
    }
    @Override
    public void run() {
        int i = 0;

        while (i < 10) {
            try {

                process0.p0();
                Thread.sleep(200);

                process1.p1();
                Thread.sleep(200);

                process2.p2();
                Thread.sleep(200);

                process3.p3();
                Thread.sleep(200);

                process4.p4();
                Thread.sleep(200);

                process5.p5();
                Thread.sleep(200);

                process6.p6();
                Thread.sleep(200);

                process7.p7();
                Thread.sleep(200);

                process8.p8();
                Thread.sleep(200);

                i++;

            } catch (InterruptedException exception) {
                System.out.println(exception);
                break;
            }
        }
    }
}
public class Timer_Animation {
    public static void main(String[] args) {
        
        Animation.createAndStart();
    }
}