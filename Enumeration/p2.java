enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}
public class p2 {
    public static void main(String[] args) {


        Day d = Day.FRIDAY;
        System.out.println(d);
        System.out.println("Ordinal is: "+d.ordinal());


        Day arr[] = Day.values();
        for(var i : arr) {
            System.out.println(i);
        }
    }
}
