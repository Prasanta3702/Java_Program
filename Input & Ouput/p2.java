/*
 * Write a program to print a message using "write()" method.
 */
import java.io.*;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Enter the message: ");
        byte[] data = new byte[20];
        try {
            System.in.read(data);
        } catch(IOException exc) { System.out.println(exc.getMessage()); }
        // display
        System.out.print("Your Text is: ");
        for(var i : data) { System.out.write(i); }
    }
}
