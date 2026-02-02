import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        problem_3 hr = new problem_3();
        hr.reverseOrder();

    }

    void reverseOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();

        }
        System.out.println("Array in forward order:");
        for (int k = 0; k < arr.length; k++) {
            System.out.println("The " + (k + 1) + " element of array is:" + arr[k]);

        }
        System.out.println("Array in Reverse order:");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.println("The " + (j + 1) + " element of array is:" + arr[j]);

        }
    }
}
