public class demo {
    public static void main(String[] args) {
        String str = "20/07/2002";

        int d = 0, m = 0, y = 0;
        char[] arr = new char[10];
        arr = str.toCharArray();

        String res ="";
        res += arr[0];
        res += arr[1];
        d = Integer.parseInt(res);

        res = "";
        res += arr[3];
        res += arr[4];
        m = Integer.parseInt(res);

        res = "";
        res += arr[6];
        res += arr[7];
        res += arr[8];
        res += arr[9];
        y = Integer.parseInt(res);

        System.out.println(d+"/"+m+"/"+y);
    }
}