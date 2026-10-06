AIM

To write a Java program to read and display the contents of a file using the FileReader class.

ALGORITHM
Start the program.
Import the java.io.* package.
Create a FileReader object for the file sample5.txt.
Read the file character by character using the read() method.
Continue reading until read() returns -1, which indicates the end of the file.
Convert each integer value into a character and display it using print().
Close the file using close().
Handle any exception using the catch block.
Stop the program.
import java.io.*;

class Filereader {
    public static void main(String[] args) { // Fixed "static" spelling
        try {
            // Moved all the reading logic inside the try block
            FileReader fr = new FileReader("sample5.txt");
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
sample5.txt contains:

Welcome to Java
File Handling Example

The output

Welcome to Java
File Handling Example
RESULT
Thus, the Java program to read and display the contents of a file using the FileReader class was executed successfully and the desired output was obtained.
