Aim

To write a Java program to demonstrate the use of arithmetic operators such as addition, subtraction, multiplication, division, and modulus.

Algorithm
Start the program.
Declare two integer variables a and b.
Assign values to a and b.
Perform addition using +.
Perform subtraction using -.
Perform multiplication using *.
Perform division using /.
Perform modulus using %.
Display all the results.
Stop the program.
import java.util.Scanner;
public class ArithmeticOperators
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
while(true)
{
System.out.println(" ");
System.out.println("Enter the two numbers to perform operations");
System.out.print("Enter the first number : ");
int x = s.nextInt();
System.out.print("Enter the second number : ");
int y = s.nextInt();
System.out.println("Choose the operation you want to perform" );
System.out.println("Choose 1 for ADDITION");
System.out.println("Choose 2 for SUBTRACTION");
System.out.println("Choose 3 for MULTIPLICATION");
System.out.println("Choose 4 for DIVISION");
System.out.println("Choose 5 for MODULUS");
System.out.println("Choose 6 for EXIT");
int n = s.nextInt();
switch(n)
{
case 1:
int add;
add = x + y;
System.out.println("Result:" +add);
break;
case 2:
int sub;
sub = x - y;
System.out.println("Result:" +sub);
break;
case 3:
int mul;
mul = x * y;
System.out.println("Result:" + mul);
break;

case 4:
float div;
div = (float) x / y;
System.out.println("Result:" + div);
break;
case 5:
int mod;
mod = x % y;
System.out.println("Result:" + mod);
break;
case 6:
System.exit(0);
}
}
}
}
Sample Output
 
Enter the two numbers to perform operations
Enter the first number : 20
Enter the second number : 5
Choose the operation you want to perform
Choose 1 for ADDITION
Choose 2 for SUBTRACTION
Choose 3 for MULTIPLICATION
Choose 4 for DIVISION
Choose 5 for MODULUS
Choose 6 for EXIT
1
Result:25
  Result

Thus, the Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven approach was executed successfully and the desired results were obtained.
 
