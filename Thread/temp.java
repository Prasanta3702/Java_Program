class Queue {
    int n;
    boolean signal = false;

    synchronized void put(int x) {
        while(signal) {
            try {
                wait();
            }
            catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
        this.n = x;
        signal = true;
        System.out.println("put value : "+this.n);
        notify();
    }

    synchronized int get() {
        while(!signal) {
            try {
                wait();
            }
            catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
        System.out.println("got value : "+this.n);
        signal = false;
        notify();
        return this.n;
    }
}
class Producer implements Runnable {
    Thread thrd;
    Queue q;

    Producer (Queue q) {
        this.q = q;
        thrd = new Thread(this, "Producer");
    }
    @Override
    public void run() {
        int i = 0;
        while(i < 5) {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable {
    Thread thrd;
    Queue q;
    
    Consumer (Queue q) {
        this.q = q;
        thrd = new Thread(this, "Consumer");
    }
    @Override
    public void run() {
        int i = 0;
        while(i < 5) {
            q.get();
            i++;
        }
    }
}
public class temp {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.thrd.start();
        c.thrd.start();
    }
}