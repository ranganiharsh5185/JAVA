import java.util.Scanner;

class time {
    int hours;
    int minutes;

    void setter(int h, int m) {
        hours = h;
        minutes = m;
    }

    double angleDifference() {
        double hourAngle = (hours % 12) * 30 + (minutes / 60.0) * 30;
        double minuteAngle = minutes * 6;
        double angleDifference = Math.abs(hourAngle - minuteAngle);
        return Math.min(angleDifference, 360 - angleDifference);
    }

    void getter() {
        System.out.println("Angle difference between hour and minute hand is: " + angleDifference() + " degrees");
    }
}

public class problem_2 {
    public static void main(String[] args) {
        time hr = new time();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        hr.setter(h, m);
        hr.getter();
    }

}
