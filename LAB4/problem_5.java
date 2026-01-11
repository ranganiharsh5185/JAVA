import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println("The year is Leap year");
        } else {
            System.out.println("The Year is not Leap year");
        }
    }
}
