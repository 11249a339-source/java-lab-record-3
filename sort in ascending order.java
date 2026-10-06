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