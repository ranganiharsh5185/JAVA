import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        problem_5 hr = new problem_5();
        hr.pattern();
    }

    void pattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word:");
        String word = sc.next();
        char[] a = word.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= a.length - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }

            System.out.println();
        }
    }
}
