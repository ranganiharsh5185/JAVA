package lab3;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("enter the no.:"));
        int a = sc.nextInt();
        System.out.print(("enter the no.:"));
        int b = sc.nextInt();
        System.out.print(("enter the no.:"));
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("the largest no. is:" + a);
            } else {
                System.out.println("the largest no. is:" + c);
            }

        } else if (b > c) {
            System.out.println("the largest no. is:" + b);

        } else {
            System.out.println("the largest no. is:" + c);
        }
    }
}
