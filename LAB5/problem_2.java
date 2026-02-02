import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        problem_2 hr = new problem_2();
        float avg = hr.avgArr();
        System.out.println("the avg of array is:" + avg);
    }

    float avgArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        float temp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element:");
            arr[i] = sc.nextInt();
            temp += arr[i];

        }
        return temp / n;
    }

}
