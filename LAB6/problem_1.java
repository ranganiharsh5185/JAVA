package lab6;

import java.util.Scanner;

class Students {
    String name;
    int rollNo;
    double spi;
    String course;

    void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = sc.nextLine();
        System.out.print("Enter rollNo.:");
        rollNo = sc.nextInt();
        System.out.print("Enter spi:");
        spi = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Course:");
        course = sc.nextLine();

    }

    void getter() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("SPI: " + spi);
        System.out.println("Course: " + course);
        System.out.println("-------------------");

    }
}

public class problem_1 {
    public static void main(String[] args) {
        Students[] S = new Students[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the details of Student:" + (i + 1));

            S[i] = new Students();
            S[i].setter();

        }
        for (int i = 0; i < 3; i++) {

            S[i].getter();

        }

    }

}
