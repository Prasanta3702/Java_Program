/*
 * Write some text and save to physical memory
 */
import java.io.*;

public class write_to_File {
    public static void main(String[] args) {
        int i;
        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("textOut.txt", false);
        } catch(IOException exc) {
            System.out.println("File Not Found");
            return;
        }
        System.out.println("Enter the text: ");
        try {
            do {
                i = System.in.read();
                if((char)i != 'q') {
                    fout.write(i);
                }
            } while((char)i != 'q');
        } catch(IOException exc) {
            System.out.println("File couldn't write");
        } finally {
            try {
                if(fout != null) {
                    fout.close();
                    System.out.println("Successfully");
                }
            } catch(IOException exc) { System.out.println("File couldn't close"); }
        }
    }
}