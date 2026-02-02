import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        problem_4 hr = new problem_4();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int copy[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();

        }

        copy = hr.copyArr(arr, copy, n);
        System.out.println("Printing Copy of array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("printing original array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    int[] copyArr(int[] arr, int[] copy, int n) {

        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];

        }
        return copy;
    }
}
