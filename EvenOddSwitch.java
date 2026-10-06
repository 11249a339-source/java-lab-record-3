AIM

To write a Java program to check whether a given number is even or odd using a switch statement.

ALGORITHM
Start the program.
Import the Scanner class.
Read an integer n from the user.
Calculate n % 2.
Use a switch statement:
If the remainder is 0, display "The number is even".
If the remainder is 1, display "The number is odd".
Stop the program.
import java.util.*;
public class EvenOddSwitch
{
    public static void main(String args[])
    {
 int n , i;
 Scanner s = new Scanner(System.in);
 n = s.nextInt();
 switch(n % 2)
 {
    case 0:
        System.out.println("The number is even");
        break;
    case 1:
        System.out.println("THe number is odd");
        break;

 }
    }
}

OUTPUT
 
Enter a number: 10
The number is even
RESULT
Thus, the Java program to find whether a given number is even or odd using a switch statement was executed successfully and the desired result was obtained.
