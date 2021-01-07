import java.util.Scanner;

public class substringReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a long string: ");
        String longString = input.nextLine();

        System.out.print("Enter a substring: ");
        String subString = input.nextLine();
        
        System.out.println("---------+---------+---------|---------+---------+---------|");

        int longStringLength = longString.length();
        int subStringLength = subString.length();

        System.out.printf("%s%36d\n", "Length of long string = ", longStringLength);
        System.out.printf("%s%38d\n", "Length of substring = ", subStringLength);

        int posOfSubString = longString.indexOf(subString);
        System.out.printf("%s%30d\n", "Start position of substring = ", posOfSubString);
        System.out.printf("%s%38s\n", "Before substring was = ", longString.substring(0, posOfSubString));
        System.out.printf("%s%38s\n", "After substring was = ", longString.substring(posOfSubString + subString.length(), (longStringLength)));

        System.out.printf("Enter a position between 0 and 43: ");
        int pos = input.nextInt();
        System.out.printf("%s%34s\n", "Character at position " + pos + " =", longString.charAt(pos));

        System.out.print("Enter a replacement string: ");
        String replacementString = input.next();
        System.out.printf("%s%56s\n", "Your new string =", longString.replace(subString, replacementString));


    }
}
