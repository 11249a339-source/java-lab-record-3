AIM

To write a Java program to check whether the given number is an Armstrong number or not.

ALGORITHM
Start the program.
Read an integer n from the user.
Store the original number in original.
Initialize sum = 0.
Extract the last digit using n % 10.
Find the cube of the digit and add it to sum.
Remove the last digit using n / 10.
Repeat steps 5–7 until n becomes 0.
Compare sum with original.
If both are equal, display that the number is an Armstrong number; otherwise, display that it is not.
Stop the program.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, original, digit, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        original = n;

        while (n != 0) {
            digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
OUTPUT
Sample 1
Enter a number: 153
153 is an Armstrong number
Sample 2
Enter a number: 123
123 is not an Armstrong number
RESULT

Thus, the Java program to check whether the given number is an Armstrong number or not was executed successfully and the desired output was obtained.
