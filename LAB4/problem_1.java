import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("enter the mark of subject " + i + " out of the 100:");
            int marks = sc.nextInt();
            sum += marks;
        }
        int percentage = sum / 5;
        if (percentage >= 60) {
            System.out.println("First division & percentage=" + percentage);

        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Second division & percentage=" + percentage);
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Third division & percentage=" + percentage);

        } else {
            System.out.println("Fail & percentage=" + percentage);
        }

    }

}
