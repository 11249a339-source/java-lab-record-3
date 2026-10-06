AIM

To write a Java program using user-defined packages to perform addition, subtraction, multiplication, and division of two numbers.

ALGORITHM
Create separate packages named add, sub, mul, and div.
Define a class in each package for the corresponding arithmetic operation.
Create methods addop(), subop(), mulop(), and divop().
Import all the required packages into the main class.
Create objects for Add, Sub, Mul, and Div.
Call the respective methods with the values 20 and 10.
Display the results of all four arithmetic operations.
package add;

public class Add
{
    int res;

    public void addop(int a, int b)
    {
        res = a + b;
        System.out.println("Add: " + res);
    }
}package sub;

public class Sub
{
    int res;

    public void subop(int a, int b)
    {
        res = a - b;
        System.out.println("Sub: " + res);
    }
}// mul/Mul.java
package mul;

public class Mul
{
    int res;

    public void mulop(int a, int b)
    {
        res = a * b;
        System.out.println("Mul: " + res);
    }
}package div;

public class Div
{
    int res;

    public void divop(int a, int b)
    {
        res = a / b;
        System.out.println("Div: " + res);
    }
}
import add.*;
import sub.*;
import mul.*;
import div.*;

public class ArithoDemo
{
    public static void main(String args[])
    {
        Add ad = new Add();
        Sub su = new Sub();
        Mul mu = new Mul();
        Div di = new Div();

        ad.addop(20,10);
        su.subop(20,10);
        mu.mulop(20,10);
        di.divop(20,10);
    }
}
OUTPUT
Add: 30
Sub: 10
Mul: 200
Div: 2
RESULT

Thus, the Java program using user-defined packages to perform arithmetic operations was executed successfully and the required results were obtained.
