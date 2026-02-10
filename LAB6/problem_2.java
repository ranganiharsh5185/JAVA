package lab6;

import java.util.Scanner;

class Cube {
    private double height;
    private double width;
    private double depth;

    void setter(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void getter() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
    }

    double volume() {
        return height * width * depth;
    }
}

public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cube c1 = new Cube();
        Cube c2 = new Cube();

        System.out.println("Enter dimensions of Cube 1:");
        c1.setter(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter dimensions of Cube 2:");
        c2.setter(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("\nCube 1 Details:");
        c1.getter();
        System.out.println("Volume of Cube 1: " + c1.volume());

        System.out.println("\nCube 2 Details:");
        c2.getter();
        System.out.println("Volume of Cube 2: " + c2.volume());
    }
}
