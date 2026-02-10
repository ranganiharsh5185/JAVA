package lab6;

import java.util.Scanner;

class Employee {
    String name;
    String jobTitle;
    double salary;

    void setter() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Job Title: ");
        jobTitle = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void updateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter increment percentage: ");
        double percent = sc.nextDouble();

        salary = salary + (salary * percent / 100);
    }

    void getter() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class problem_5 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setter();

        e.updateSalary();
        e.getter();

    }
}
