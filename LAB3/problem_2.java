package lab3;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter the mathematical operator(for exit press 0):");
            String h = sc.next();
            if (h.equals("0")) {

                return;

            }
            System.out.print(("enter the no.:"));
            int a = sc.nextInt();
            System.out.print(("enter the no.:"));
            int b = sc.nextInt();
            switch (h) {
                case "+":
                    System.out.println("the sum of no. is:" + (a + b));
                    break;

                case "-":
                    System.out.println("the substraction of no. is:" + (a - b));
                    break;
                case "*":
                    System.out.println("the multiplication of no. is:" + (a * b));
                    break;
                case "/":
                    System.out.println("the division of no. is:" + (a / b));
                    break;
                case "%":
                    System.out.println("the modulo of no. is:" + (a % b));

            }

        }

    }

}
