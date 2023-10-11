public class convertion {
    public static void main(String[] args) {
        int value = 12;

        System.out.println("Binary value of "+value+" is: "+Integer.toBinaryString(value));
        System.out.println("Octal number of "+value+" is: "+Integer.toOctalString(value));
        System.out.println("Hexadecimal number of "+value+" is: "+Integer.toHexString(value));
    }
}
