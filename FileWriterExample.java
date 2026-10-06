AIM

To write a Java program to create a file and write data into it using the FileWriter class.

ALGORITHM
Start the program.
Import FileWriter and IOException.
Create a FileWriter object for the file sample.txt.
Use the write() method to write data into the file.
Close the file using the close() method.
Display "Data written successfully."
If an error occurs, handle it using the catch block and display "An error occurred."
Stop the program.
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Welcome to Java File Handling");
            fw.write("\nThis file is created using FileWriter.");

            fw.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
OUTPUT
Data written successfully.
Contents of sample.txt
Welcome to Java File Handling
This file is created using FileWriter.
RESULT

Thus, the Java program to create a file and write data using the FileWriter class was executed successfully and the data was written into the file.
