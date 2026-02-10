package lab6;

import java.util.Scanner;

class A {
    int[] arr = new int[5];

    A() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void sortArray() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void searchArray(int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + key + " not found");
        }
    }

    void sumArray() {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum of Array: " + sum);
    }

    void avgArray() {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average of Array: " + avg);
    }
}

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();

        obj.sortArray();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.searchArray(key);

        obj.sumArray();
        obj.avgArray();
    }
}
