/*
 * Write a file from keyboard using "FileOutputStream()" class and copy to another files
 */
import java.io.*;

public class p4 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        try {
            fin = new FileInputStream("textIn.txt");
            fout = new FileOutputStream("textOut.txt", false);

            do {
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }
            } while(i != -1);
            System.out.println("Coppied Successfull");

        } catch(FileNotFoundException exc) {
            System.out.println("File not found");
        } catch(IOException exc) {
            System.out.println("File couldn't read");
        } finally {
            try {
                if(fin != null) { fin.close(); }
                if(fout != null) { fout.close(); }
            } catch(IOException exc) {
                System.out.println("File couldn't close");
            }
        }
    }
}