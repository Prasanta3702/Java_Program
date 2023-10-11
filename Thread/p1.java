class ThreadDemo implements Runnable {
    Thread t;

    ThreadDemo(String name) {
        t = new Thread(this, name);
        System.out.println("Child Thread name is: "+t.getName());
    }
    @Override
    public void run() {
        System.out.println(t.getName()+" thread is starting...");

        for(int i = 0; i < 5; i++) {
            System.out.println(t.getName()+" thread is consume: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {}
        }
        System.out.println(t.getName()+" thread is terminated...");
    }
}
public class p1 {
    public static void main(String[] args) {
        ThreadDemo ob = new ThreadDemo("Child #1");

        ob.t.start();

        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" thread consume: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {}
        }
        System.out.println(Thread.currentThread().getName()+" thread is terminated...");
    }
}