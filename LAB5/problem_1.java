import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        problem_1 hr = new problem_1();
        int sum = hr.sumArr();
        System.out.println("the sum of array is:" + sum);
    }

    int sumArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();
            temp += arr[i];

        }
        return temp;
    }

}
