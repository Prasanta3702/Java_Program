// input a string using "read()" method from keyboard

import java.io.*;

public class p1 {
    public static void main(String[] args) {
        byte[] data = new byte[35];
        try {
            System.out.println("Enter the some text: ");
            System.in.read(data);
        } catch(IOException exc) {
            System.out.println(exc.getLocalizedMessage());
        }
        System.out.println("\nYour Text: ");
        for(byte i : data) { System.out.print((char)i); }
    }
}