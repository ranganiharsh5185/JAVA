package lab3;

import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length:");
        int a = sc.nextInt();
        System.out.print("enter the breadth:");
        int b = sc.nextInt();
        System.out.println("the are reactangle is:" + (2 * (a + b)));
    }
}
