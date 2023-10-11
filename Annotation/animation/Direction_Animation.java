enum Direction {
    LEFT, RIGHT, TOP, BOTTOM;
}
class DirectionOperation {
    Direction dir;

    // set direction automatic
    DirectionOperation() {
        dir = Direction.TOP;
    }
    // set direction manually
    DirectionOperation(Direction dir) {
        this.dir = dir;
    }

    synchronized void Top() {
        while(dir == Direction.valueOf("RIGHT") | dir == Direction.valueOf("BOTTOM") | dir == Direction.valueOf("LEFT")) {
            try {
                wait();
            }
            catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }
        }
        top.Top();
        try {
            Thread.sleep(200);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
        changeDirection();
        notifyAll();
    }
    synchronized void Right() {
        while(dir == Direction.valueOf("TOP") | dir == Direction.valueOf("BOTTOM") | dir == Direction.valueOf("LEFT")) {
            try {
                wait();
            }
            catch (InterruptedException exception) {
                System.out.println(exception.getLocalizedMessage());
            }
        }
        right.Right();
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
        changeDirection();
        notifyAll();
    }
    synchronized void Bottom() {
        while(dir == Direction.valueOf("TOP") | dir == Direction.valueOf("RIGHT") | dir == Direction.valueOf("LEFT")) {
            try {
                wait();
            }
            catch (InterruptedException exception) {
                System.out.println(exception.getLocalizedMessage());
            }
        }
        down.Down();
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
        changeDirection();
        notifyAll();
    }
    synchronized void Left() {
        while(dir == Direction.valueOf("TOP") | dir == Direction.valueOf("RIGHT") | dir == Direction.valueOf("BOTTOM")) {
            try {
                wait();
            }
            catch (InterruptedException exception) {
                System.out.println(exception.getLocalizedMessage());
            }
        }
        left.Left();
        try {
            Thread.sleep(200);
        }
        catch(InterruptedException exception) {
            System.out.println(exception.getLocalizedMessage());
        }
        changeDirection();
        notifyAll();
    }
    synchronized void changeDirection() {
        switch(dir) {
            case TOP -> dir = Direction.RIGHT;
            case RIGHT -> dir = Direction.BOTTOM;
            case BOTTOM -> dir = Direction.LEFT;
            case LEFT -> dir = Direction.TOP;
        }
    }
}
class DirectionSimulatorTop implements Runnable {
    Thread thrd;
    DirectionOperation op;

    DirectionSimulatorTop(DirectionOperation op) {
        this.op = op;
        thrd = new Thread(this, "Top");
    }
    // auto start thread
    public static DirectionSimulatorTop createAndStart(DirectionOperation op) {
        DirectionSimulatorTop ob = new DirectionSimulatorTop(op);
        ob.thrd.start();
        return ob;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++) {
            op.Top();
        }
    }
}
class DirectionSimulatorRight implements Runnable {
    Thread thrd;
    DirectionOperation op;
    
    DirectionSimulatorRight(DirectionOperation op) {
        this.op = op;
        thrd = new Thread(this, "Right");
    }
    // auto start thread
    public static DirectionSimulatorRight createAndStart(DirectionOperation op) {
        DirectionSimulatorRight ob = new DirectionSimulatorRight(op);
        ob.thrd.start();
        return ob;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++) {
            op.Right();
        }
    }
}
class DirectionSimulatorBottom implements Runnable {
    Thread thrd;
    DirectionOperation op;

    DirectionSimulatorBottom(DirectionOperation op) {
        this.op = op;
        thrd = new Thread(this, "Bottom");
    }
    // auto start thread
    public static DirectionSimulatorBottom createAndStart(DirectionOperation op) {
        DirectionSimulatorBottom ob = new DirectionSimulatorBottom(op);
        ob.thrd.start();
        return ob;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++) {
            op.Bottom();
        }
    }
}
class DirectionSimulatorLeft implements Runnable {
    Thread thrd;
    DirectionOperation op;

    DirectionSimulatorLeft(DirectionOperation op) {
        this.op = op;
        thrd = new Thread(this, "Left");
    }
    public static DirectionSimulatorLeft createAndStart(DirectionOperation op) {
        DirectionSimulatorLeft ob = new DirectionSimulatorLeft(op);
        ob.thrd.start();
        return ob;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 30; i++) {
            op.Left();
        }
    }
}
public class Direction_Animation {
    public static void main(String[] args) {
        DirectionOperation ob = new DirectionOperation();
        DirectionSimulatorTop.createAndStart(ob);
        DirectionSimulatorRight.createAndStart(ob);
        DirectionSimulatorBottom.createAndStart(ob);
        DirectionSimulatorLeft.createAndStart(ob);
    }
}
