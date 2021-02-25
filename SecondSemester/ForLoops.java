package SecondSemester;

import java.util.Scanner;
public class ForLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gimme a positive integer: ");
        int posInt = input.nextInt();

        System.out.print("The sum of all even numbers between 2 and " + posInt + " = ");

        int num = 0;
        for (int i = 2; i <= posInt; i += 2) {
            num += i;
        }
        System.out.println(num);

        int sqre = 0;

        for (int i = 1; i * i <= posInt; i++) {
            int sum = i * i;
            sqre += sum;
        }
        System.out.println("The sum of all even numbers between 2 and " + posInt + " = " + sqre);

        System.out.print("Gimme a positive integer larger than " + posInt + ": ");
        int largPosInt = input.nextInt();

        int num2 = 0;
        for (int i = posInt; i <= largPosInt; i += 2) {
            if (largPosInt > posInt) {
                num2 += i;
            }
        }  System.out.println("The sum of all odd numbers between " + posInt + " and " + largPosInt + " = " + num2);


        int num3 = 0;

        int sumOfAllOddDigits;

        for(num3 = 0; posInt != 0; posInt/=10){
            sumOfAllOddDigits = posInt % 10;
            if(sumOfAllOddDigits % 2 !=0){
                num3 += sumOfAllOddDigits;
            }
        }
        
        System.out.print("The sum of all odd digits of " + num3);
    }
}