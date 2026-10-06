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