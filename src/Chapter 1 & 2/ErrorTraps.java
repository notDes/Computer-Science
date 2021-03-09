import java.util.Scanner;

public class ErrorTraps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");

        String userInput = input.next();

        if (userInput.length() > 0) {
            char letter = userInput.charAt(0);

            if ((userInput.length() == 1) && (letter >= 65) && (letter <= 122)) {
                final String CONSONANT = "CONSONANT";
                final String VOWEL = "VOWEL";
                switch (letter) {
                    case 65:
                        System.out.print(VOWEL);
                        break;
                    case 69:
                        System.out.print(VOWEL);
                        break;
                    case 73:
                        System.out.print(VOWEL);
                        break;
                    case 79:
                        System.out.print(VOWEL);
                        break;
                    case 97:
                        System.out.print(VOWEL);
                        break;
                    case 101:
                        System.out.print(VOWEL);
                        break;
                    case 105:
                        System.out.print(VOWEL);
                        break;
                    case 111:
                        System.out.print(VOWEL);
                        break;
                    case 117:
                        System.out.print(VOWEL);
                        break;
                    default:
                        System.out.println(CONSONANT);
                        break;

                }

            } else {
                System.out.print("ERROR");
            }
        } else {
            System.out.print("ERROR");
        }

    }
}