AIM

To write a Java program to find the sum, largest number, and smallest number in a given array.

ALGORITHM
Start the program.
Declare and initialize an integer array with the given elements.
Initialize sum = 0.
Set the first array element as both min and max.
Traverse the array from the second element using a for loop.
If the current element is greater than max, update max.
If the current element is smaller than min, update min.
Add each element to sum.
Display the sum, largest number, and smallest number.
Stop the program.
public class LargestSmallest
{
public static void main(String[]args)
   {
     int a[] = new int[] {23,24,13,64,72,90,10,15,89,27};
     int sum = 0;
     int min = a[0];
     int max = a[0];
     for (int i = 1;i < a.length;i++)
     {
         if (a[i] > max)
         {
           max = a[i];
        }
        if(a [i] < min)
        {
          min = a[i];
        }
        sum = sum + a[i];
}
System.out.println("The sum is:" + sum);
System.out.println("Largest Number in a given array is:" + max);
System.out.println("Smallest Number in a given array is:" + min);
}
}
OUTPUT

For the given array:

23 24 13 64 72 90 10 15 89 27
The sum is:427
Largest Number in a given array is:90
Smallest Number in a given array is:10
RESULT

Thus, the Java program to find the sum, largest number, and smallest number in the given array was executed successfully and the desired results were obtained.
