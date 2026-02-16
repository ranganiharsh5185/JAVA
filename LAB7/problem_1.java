import java.util.Scanner;

class area {
    double radius;

    void setter(double r) {
        radius = r;
    }

    double areaOfcircle() {
        return (int) (3.14 * radius * radius);
    }

    void getter() {
        System.out.println("Area of circle is: " + areaOfcircle());
    }
}

public class problem_1 {
    public static void main(String[] args) {
        area hr = new area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        hr.setter(sc.nextDouble());
        hr.getter();

    }
}
