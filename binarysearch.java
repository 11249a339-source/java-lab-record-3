AIM

To write a Java program to search for a given element in a sorted array using Binary Search.

ALGORITHM
Start the program.
Read the number of elements n.
Create an integer array of size n.
Read the elements of the array.
Read the element x to be searched.
Set first = 0 and last = n - 1.
Repeat while first <= last:
Calculate mid = (first + last) / 2.
If a[mid] > x, set last = mid - 1.
If a[mid] < x, set first = mid + 1.
Otherwise, the element is found. Set flag = 1 and stop searching.
If flag == 0, display Element not found.
Otherwise, display Element found.
Stop the program.
import java.util.Scanner;

class binarysearch {
    public static void main(String[] args) {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements of array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        x = sc.nextInt();

        first = 0;
        last = n-1;

        while (first <= last) {
            mid = (first + last)/2;

            if (a[mid] > x)
 {
                last = mid - 1;
            } else if (a[mid]<x) {
                first = mid + 1;
            } else {
                flag = 1;
                System.out.println("Element found");
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }

       
    }
}
OUTPUT
Sample Output – Element Found
Enter number of elements:
5
Enter elements of array:
10
20
30
40
50
Enter element to search:
30
Element found
RESULT
Thus, the Java program to search for an element using Binary Search was executed successfully and the desired result was obtained.
