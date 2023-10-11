class ExtendsDemo extends Thread {
    ExtendsDemo(String name) {
        super(name);
        System.out.println("Child Thread is: "+getName());
    }
    @Override 
    public void run() {
        System.out.println(getName()+" Thread is starting...\n");

        for(int i = 0; i < 5; i++) {
            System.out.println((char)3);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException exception) {}
        }
        System.out.println(getName()+" Thread is terminated....\n");
    }
}
class ExtendsDemo2 extends ExtendsDemo {
    ExtendsDemo2(String name) {
        super(name);
    }
    @Override
    public void run(){
        super.run();
        System.out.println("\nExtending Class....\n");
    }
}
public class p2 {
    public static void main(String[] args) {
        ExtendsDemo2 ob = new ExtendsDemo2 ("Prasanta");

        ob.start();

        for(int i = 0; i < 5; i++) {
            System.out.println((char)5);
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {}
        }
        System.out.println("Main thread is terminated....");
    }
}