import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive single digit integer: ");

        int singleDigitInt = input.nextInt();

        switch(singleDigitInt){
            case 1:
                System.out.println("Roman Numeral I");
                break;
            case 2:
                System.out.println("Roman Numeral II");
                break;
            case 3:
                System.out.println("Roman Numeral III");
                break;
            case 4:
                System.out.println("Roman Numeral IIII");
                break;
            case 5:
                System.out.println("Roman Numeral V");
                break;   
            case 6:
                System.out.println("Roman Numeral VI");
                break;      
            case 7:
                System.out.println("Roman Numeral VII");
                break;      
            case 8:
                System.out.println("Roman Numeral VIII");
                break;      
            case 9:
                System.out.println("Roman Numeral IX");
                break;      
            case 10:
                System.out.println("Roman Numeral X");
                break;       

            default: singleDigitInt = 0;
            System.out.println("That is NOT a positive single digit integer");
                break;

        }
    }
}
