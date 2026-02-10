package lab6;

import java.util.Scanner;

class bankAcc {
    int acc_no;
    double balance;
    private int pin;

    void setter(int a, double b, int p) {
        acc_no = a;
        balance = b;
        pin = p;
    }

    void getter(int a, int p1) {
        if (acc_no == a && pin == p1) {
            System.out.println("acc_no:" + acc_no + " balance:" + balance);
        } else {
            System.out.println("Wrong info.");
        }
    }
}

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankAcc b1 = new bankAcc();
        bankAcc b2 = new bankAcc();
        bankAcc b3 = new bankAcc();

        System.out.print("set the pin for acc no.1111:");
        int pin = sc.nextInt();
        b1.setter(1111, 176.56, pin);
        System.out.print("set  the pin for acc no.1112:");
        pin = sc.nextInt();
        b2.setter(1112, 14576.99, pin);
        System.out.print("set the pin for acc no.1113:");
        pin = sc.nextInt();
        b3.setter(1113, 154576.56, pin);
        System.out.println("Enter 1 for check balance");
        System.out.print("Enter 0 for exit:");
        int i = sc.nextInt();
        while (i != 0) {

            System.out.print("Enter the acc no. to check balance:");
            int a = sc.nextInt();
            System.out.print("Enter the pin of that acc no.:");

            int p1 = sc.nextInt();
            if (a == 1111)
                b1.getter(a, p1);
            else if (a == 1112)
                b2.getter(a, p1);
            else if (a == 1113)
                b3.getter(a, p1);
            else
                System.out.println("Account not found.");
            System.out.println("Enter 1 for check balance of another acc.");
            System.out.print("Enter 0 for exit:");
            i = sc.nextInt();

        }

    }
}