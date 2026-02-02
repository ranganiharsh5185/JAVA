import java.util.Scanner;

public class problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problem_7 hr = new problem_7();
        System.out.print("Enter the no. of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();

        }
        arr = hr.sortedAscending(arr);
        arr = hr.pivotRotate(arr, sc);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    int[] sortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    int[] pivotRotate(int[] arr, Scanner sc) {
        System.out.print("Enter pivot index:");
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        return arr;
    }

}
