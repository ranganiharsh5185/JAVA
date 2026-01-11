import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("The no. is Not Prime");

        } else {
            System.out.println("The no. is Prime");
        }
    }
}
