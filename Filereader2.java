import java.io.*;

class Filereader2 {
    public static void main(String[] args) { // Fixed "static" spelling
        try {
            // Moved all the reading logic inside the try block
            FileReader fr = new FileReader("sample4.txt");
            int i;
            
            // Fixed the parentheses order so the assignment happens first
            while ((i = fr.read()) != -1) {
                System.out.print((char) i); // Changed to print() so it stays on one line like "ABC..."
            }
            
            fr.close();
        } // Closed the try block directly before the catch block
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
