package lab3;

import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the fahrenheit:");
        float f = sc.nextFloat();
        System.out.println("the temprature in celcius is:" + ((f - 32) * 5 / 9.0));

    }
}
