import java.util.Scanner;  


public class methodMadness {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first number:");
    int firstNumber = input.nextInt();

    System.out.print("Enter your second number:");
    int secondNumber = input.nextInt();

      if (firstNumber > secondNumber) {
        System.out.println(firstNumber + " is larger than " + secondNumber );
    }
      else{
        System.out.println(secondNumber + " is larger than " + firstNumber);
    }

      System.out.print("Enter the first string:");

      String firstString = input.next();
    
      System.out.print("Enter the second string:");

      String secondString = input.next();

      int value = firstString.compareTo(secondString);

        if (value < 1 ) {
            System.out.println(firstString + " comes before " + secondString + " lexicographically");
            
        }else{
            System.out.println(secondString + " comes before " + firstString + " lexicographically");

        }

      int correctAnswers = 0;

      String Correct = "Correct!";
      String Incorrect = "Wrong!";
      String correctAnswersString = "The correct answer is...";

        System.out.print("Enter your name:");
        String name = input.next();
        System.out.println("Welcome " + name + "!" + " Please answer the following questions...");

        //math questions below
        
        //ADDITION
        System.out.print(firstNumber + " + " + secondNumber + ":"); 

        int sumAnswer = input.nextInt();

        if (sumAnswer == firstNumber + secondNumber) {
          System.out.println(Correct);
          correctAnswers = correctAnswers + 1;
          
        }else{
          int realAnswer = firstNumber + secondNumber;
          System.out.println(Incorrect);
          System.out.println(correctAnswersString + realAnswer);
        }
        // MULITPLICATION
        System.out.print(firstNumber + " * " + secondNumber + ":"); 

        int productAnswer = input.nextInt();

        if (productAnswer == firstNumber * secondNumber) {
          System.out.println(Correct);
          correctAnswers = correctAnswers + 1;
          
        }else{
        int realAnswer = firstNumber * secondNumber;
          System.out.println(Incorrect);
          System.out.println(correctAnswersString+ realAnswer);

        }
        // DIVISION
        System.out.print(firstNumber + " / " + secondNumber + ":"); 

        int quotientAnswer = input.nextInt();

        if (quotientAnswer == firstNumber / secondNumber) {
          System.out.println(Correct);
          correctAnswers = correctAnswers + 1;

        }else{
          int realAnswer = firstNumber / secondNumber;
          System.out.println(Incorrect);
          System.out.println(correctAnswersString + realAnswer);
        }

        // PERCENT
        System.out.print(firstNumber + " % " + secondNumber + ":"); 

        int percentAnswer = input.nextInt();

        if (percentAnswer == firstNumber % secondNumber) {
          System.out.println(Correct);
          correctAnswers = correctAnswers + 1;

          
        }else{
          int realAnswer = firstNumber % secondNumber;
          System.out.println(Incorrect);
          System.out.println(correctAnswersString + realAnswer);
        }


        System.out.println("You got " + correctAnswers + " correct answers");
        double percentage = correctAnswers / 4.0 * 100 ;

        System.out.println("That's " + percentage + "%" );
        

  }
}


