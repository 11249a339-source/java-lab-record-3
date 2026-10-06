AIM

To write a Java program to find the largest of three given numbers using if-else-if statements.

ALGORITHM
Start the program.
Import the Scanner class.
Declare three integer variables x, y, and z.
Read three numbers from the user.
Compare x with y and z.
If x is greater than both, display First number is largest.
Otherwise, compare y with x and z.
If y is greater than both, display Second number is largest.
Otherwise, compare z with x and y.
If z is greater than both, display Third number is largest.
If none of the conditions are satisfied, display These numbers are not distinct.
Stop the program.
import java.util.Scanner;
class LargestOfThreeNumbers
{
    public static void main(String args[])
{
  int x,y,z;
  System.out.println("Enter three integers");
  Scanner in = new Scanner(System.in);
  x = in.nextInt();
  y = in.nextInt();
  z = in.nextInt();
  if (x>y && x>z)
    System.out.println("First number is largest."); 
else if (y>x && y>z) 
    System.out.println("Second number is Largest.");
else if (z>x && z>y)
    System.out.println("Third number is largest.");
else 
     System.out.println("These numbers are not distinct");
} 
}
OUTPUT
For input 25 40 30:
Enter three integers
25
40
30
Second number is Largest.
    RESULT

Thus, the Java program to find the largest of three numbers using if-else-if statements was executed successfully and the desired result was obtained.
