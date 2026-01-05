package lab2;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the letter:");
        String h = sc.next();
        if (h.equals("a") || h.equals("e") || h.equals("i") || h.equals("o") || h.equals("u") || h.equals("A")
                || h.equals("E") || h.equals("I") || h.equals("O") || h.equals("U")) {
            System.out.println("VOWEL");
        } else {
            System.out.println("CONSONANT");
        }
    }

}
