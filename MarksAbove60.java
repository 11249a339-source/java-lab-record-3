AIM

To write a Java program to read the marks of students and display the marks that are above 60 using an array.

ALGORITHM
Start the program.
Import the Scanner class.
Read the number of students n.
Create an integer array marks of size n.
Read and store the marks of all students in the array.
Traverse the array using a for loop.
Check whether each mark is greater than 60.
If the mark is greater than 60, display it.
Close the Scanner.
Stop the program.
import java.util.Scanner;

public class MarksAbove60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of students: ");
        n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks above 60:");

        for (int i = 0; i < n; i++) {
            if (marks[i] > 60) {
                System.out.println(marks[i]);
            }
        }

        sc.close();
    }
}
Output
Enter the number of students: 6
Enter the marks:
45
75
82
56
91
60
Marks above 60:
75
82
 RESULT
Thus, the Java program to find and display the marks above 60 was executed successfully and the desired output was obtained.
