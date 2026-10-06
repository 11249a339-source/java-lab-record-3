import java.util.Scanner;

public class MarksAbove60 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter the number of students: ");
        n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks above 60:");

        for (int i = 0; i < n; i++) {
            if (marks[i] > 60) {
                System.out.println(marks[i]);
            }
        }

        sc.close();
    }
}