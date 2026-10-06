AIM

To write a Java program to sort the given elements in ascending order using Bubble Sort.

ALGORITHM
Start the program.
Read the number of elements n.
Create an integer array of size n.
Read the elements into the array.
Compare adjacent elements using two for loops.
If the first element is greater than the second, swap them.
Repeat the process until all elements are sorted.
Display the elements in ascending order.
Stop the program.
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, j, temp;

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Bubble Sort
        for (i = 0; i < n - 1; i++) {

            for (j = 0; j < n - 1 - i; j++) {

                if (a[j] > a[j + 1]) {

                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements in ascending order:");

        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
OUTPUT
Enter the number of elements: 5
Enter the elements:
50
20
40
10
30
Elements in ascending order:
10 20 30 40 50
RESULT
Thus, the Java program to sort the given elements in ascending order using Bubble Sort was executed successfully and the desired result was obtained.
