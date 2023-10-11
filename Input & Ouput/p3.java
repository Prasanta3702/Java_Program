/*
 * Display the text from a file using "FileInputStream()" class
 */
import java.io.*;

public class p3 {
    public static void main(String[] args) {
        FileInputStream fin;
        int i;
        try {
            fin = new FileInputStream("text.txt");
        } catch(FileNotFoundException exception) {
            System.out.println("File Not Found");
            return;
        }
        // display
        try {
            do {
                i = fin.read();
                if(i != -1) { System.out.print((char)i); }
            } while(i != -1);
        } catch(IOException exc) { System.out.println("File Not Read"); }
        // close the file
        finally {
            try {
                fin.close();
            } catch(IOException exc) { System.out.println("File Not Close"); }
        }
    }
}