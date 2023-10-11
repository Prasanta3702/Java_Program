enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class DaySchedule {
    boolean change = false;
    Day d;

    DaySchedule() {
        d = Day.SUNDAY;
    }

    DaySchedule(Day d) {
        this.d = d;
    }

    synchronized void displayDay() {
        while (change) {
            try {
                wait();
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }
        }
        switch (d) {
            case SUNDAY -> System.out.println("Sunday : " + d.ordinal());
            case MONDAY -> System.out.println("Monday : " + d.ordinal());
            case TUESDAY -> System.out.println("Tuesday : " + d.ordinal());
            case WEDNESDAY -> System.out.println("Wednesday : " + d.ordinal());
            case THURSDAY -> System.out.println("Thursday : " + d.ordinal());
            case FRIDAY -> System.out.println("Friday : " + d.ordinal());
            case SATURDAY -> System.out.println("Saturday : " + d.ordinal());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }

        change = true;
        notify();
    }

    synchronized void changeDay() {
        while (!change) {
            try {
                wait();
            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
        switch (d) {
            case SUNDAY -> d = Day.MONDAY;
            case MONDAY -> d = Day.TUESDAY;
            case TUESDAY -> d = Day.WEDNESDAY;
            case WEDNESDAY -> d = Day.THURSDAY;
            case THURSDAY -> d = Day.FRIDAY;
            case FRIDAY -> d = Day.SATURDAY;
            case SATURDAY -> d = Day.SUNDAY;
        }
        change = false;
        notify();
    }
}

class DayScheduleDemo implements Runnable {
    Thread thrd;
    DaySchedule ob;

    DayScheduleDemo(DaySchedule d, String name) {
        this.ob = d;
        thrd = new Thread(this, name);
    }

    public static DayScheduleDemo createAndStart(DaySchedule d, String name) {
        DayScheduleDemo mythrd = new DayScheduleDemo(d, name);
        mythrd.thrd.start();
        return mythrd;
    }

    public int Length() {
        int count = 0;
        for (var i : Day.values()) {
            count++;
        }
        return count;
    }

    @Override
    public void run() {
        if (thrd.getName().equals("display")) {
            for (int i = 0; i < Length(); i++) {
                ob.displayDay();
            }
        } else {
            for (int i = 0; i < Length(); i++) {
                ob.changeDay();
            }
        }
    }
}

public class p1 {
    public static void main(String[] args) {
        DaySchedule d = new DaySchedule();
        DayScheduleDemo.createAndStart(d, "display");
        DayScheduleDemo.createAndStart(d, "change");

    }
}