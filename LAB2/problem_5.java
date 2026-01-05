package lab2;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the meter:");
        float a = sc.nextFloat();
        System.out.println("the given meter in feet is:" + (a * 3.28));
    }
}
