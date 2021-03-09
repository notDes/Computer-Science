import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first number: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter your second number: ");
    int secondNumber = input.nextInt();

    int sum = firstNumber + secondNumber;
    int difference = firstNumber - secondNumber;
    int product = firstNumber * secondNumber;
    int average = (firstNumber + secondNumber) / 2;
    
    System.out.printf("%5s %10s%n", "Sum:", sum);
    System.out.printf("%5s %3s%n", "Difference:", difference);
    System.out.printf("%5s %8s%n", "Product:", product);
    System.out.printf("%5s %7s%n", "Average:", average);

    if (firstNumber > secondNumber){
      int distance = firstNumber - secondNumber;
      System.out.printf("%5s %5s%n", "Distance:", distance);

      int maximum = firstNumber;
      int minimum = secondNumber;
      System.out.printf("%5s %7s%n", "Maximum:", maximum);
      System.out.printf("%5s %7s%n", "Minimum:", minimum);
    }else{
      int distance = secondNumber - firstNumber;
      System.out.printf("%5s %5s%n", "Distance:", distance);

      int maximum = secondNumber;
      int minimum = firstNumber;
      System.out.printf("%5s %7s%n", "Maximum:", maximum);
      System.out.printf("%5s %7s%n", "Minimum:", minimum);
    }





    }
}