class TickTock {
    boolean signal = false;

    synchronized void Tick() {
        while(signal) {
            try {
                wait();
            }
            catch (InterruptedException exc) { 
                System.out.println(exc.getMessage());
            }
        }
        System.out.print("Tick ");
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException exc) { System.out.println(exc.getMessage()); }
        signal = true;
        notify();
    }
    synchronized void Tock() {
        while(!signal) {
            try {
                wait();
            }
            catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
        System.out.println("Tock");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException exc) { System.out.println(exc.getMessage()); }
        signal = false;
        notify();
        return;
    }
}
class TickTockSimulator implements Runnable {
    Thread thrd;
    TickTock ob;

    TickTockSimulator (TickTock ob) {
        this.ob = ob;
        thrd = new Thread(this);
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            ob.Tick();
        }
    }
}
class TickTockSimulator2 implements Runnable {
    Thread thrd;
    TickTock ob;

    TickTockSimulator2(TickTock ob) {
        this.ob = ob;
        thrd = new Thread(this);
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            ob.Tock();
        }
    }
}
public class synchronized_TickTock {
    public static void main(String[] args) {
        TickTock ob = new TickTock();
        TickTockSimulator t1 = new TickTockSimulator(ob);
        TickTockSimulator2 t2 = new TickTockSimulator2(ob);
        
        t1.thrd.start(); 
        t2.thrd.start();     
    }
}