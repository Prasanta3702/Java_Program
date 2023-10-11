import java.io.*;

public class convert_string_to_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        String str;
        int i;
        int sum = 0;

        System.out.println("Enter the number (0 to stop): ");
        do {
            str = br.readLine();
            
            try {
                i = Integer.parseInt(str);
            }
            catch(NumberFormatException exception) {
                System.out.println(exception.getLocalizedMessage());
                i = 0;
            }
            sum += i;

            System.out.println("Current sum is: "+sum);
        }
        while(i != 0);
    }
}