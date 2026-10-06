AIM

To write a Java program to check whether a given year is a leap year or not.

ALGORITHM
Start the program.
Import the Scanner class.
Read the year from the user.
Check if the year is divisible by 400.
If yes, it is a leap year.
Otherwise, check if it is divisible by 100. If yes, it is not a leap year.
Otherwise, check if it is divisible by 4. If yes, it is a leap year.
Otherwise, it is not a leap year.
Display the result.
Stop the program.
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = s.nextInt();
        boolean flag = false;
        
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        
        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
        
        s.close(); // Best practice: close the scanner
    }
}
OUTPUT
    Enter any year: 2024
Year 2024 is a Leap Year
    RESULT

Thus, the Java program to check whether the given year is a leap year or not was executed successfully and the desired result was obtained.
