import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int n = sc.nextInt();
        problem_6 hr = new problem_6();
        hr.pattern(n);

    }

    void pattern(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
