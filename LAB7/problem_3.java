import java.util.Scanner;

class VowelCounter {

     int totalA = 0;
     int totalE = 0;
     int totalI = 0;
     int totalO = 0;
     int totalU = 0;

 void countVowels(String sentence) {

        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            switch (ch) {
                case 'a': countA++; totalA++; break;
                case 'e': countE++; totalE++; break;
                case 'i': countI++; totalI++; break;
                case 'o': countO++; totalO++; break;
                case 'u': countU++; totalU++; break;
            }
        }

        System.out.println("Vowel count in this sentence:");
        System.out.println("A: " + countA);
        System.out.println("E: " + countE);
        System.out.println("I: " + countI);
        System.out.println("O: " + countO);
        System.out.println("U: " + countU);
        System.out.println();
    }

 void getter() {
        System.out.println("Total vowel count in all sentences:");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " + totalI);
        System.out.println("O: " + totalO);
        System.out.println("U: " + totalU);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelCounter hr = new VowelCounter();

        while (true) {
            System.out.print("Enter a sentence (type 'quit' to exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            hr.countVowels(input);
        }

        hr.getter();
    }
}
