package SecondSemester;
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        String reverse = "";

        while (!flag) {
            System.out.println("Enter a string: ");
            String userString = input.nextLine();
            int stringLength = userString.length();

            if (stringLength < 1) {
                System.out.print("Empty line read - Goodbye!");
                flag = false;
                break;
            }

            for (int i = stringLength - 1; i >= 0; i--) {
                reverse = reverse + userString.charAt(i);

            }
            if (userString.equals(reverse)) {
                System.out.println(userString + " is a palindrome.");
            } else {
                System.out.println(userString + " is not a palindrome.");
            }

        }
    }

}