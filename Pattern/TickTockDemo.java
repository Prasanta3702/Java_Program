class TickTock {
    String state;

    synchronized void Tick(boolean running) {
        if(!running) {
            state = "tick";
            notify();
            return;
        }

        // main input display 

        // System.out.print("Tick ");

                int n = 20;
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
                System.out.println("\n");
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("\033[H\033[2J");
        state = "tick";
        notify();
        try {
            while(!state.equals("tock")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
    synchronized void Tock(boolean running) {
        if(!running) {
            state = "tock";
            notify();
            return;
        }
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
                System.out.println("\n");
        try { 
            Thread.sleep(500);
        }
        catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("\033[H\033[2J");
        state = "tock";
        notify();
        try {
            while(!state.equals("tick")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
class TickTockSimulator implements Runnable {
    Thread thrd;
    TickTock ob;
    TickTockSimulator(String name, TickTock ob) {
        thrd = new Thread(this, name);
        this.ob = ob;
    }
    public static TickTockSimulator createAndStart(String name, TickTock ob) {
        TickTockSimulator mythrd = new TickTockSimulator(name, ob);
        mythrd.thrd.start();
        return mythrd;
    }
    @Override
    public void run() {     
        if(thrd.getName().equals("Tick")) {
            for(int i = 0; i <50; i++) {
                ob.Tick(true);
            }
            ob.Tick(false);
        }
        else {
            for(int i = 0; i < 50; i++) {
                ob.Tock(true);
            }
            ob.Tock(false);
        }  
    }
}
public class TickTockDemo {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        TickTock ob = new TickTock();
        TickTockSimulator mt1 = TickTockSimulator.createAndStart("Tick", ob);
        TickTockSimulator mt2 = TickTockSimulator.createAndStart("Tock", ob);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread is terminated...");
        }
    }
}
