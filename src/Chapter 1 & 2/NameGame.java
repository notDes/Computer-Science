import java.util.Scanner;

class NameGame {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.println("Hello " + firstName + "!");


    int lengthOfFirstName = firstName.length();
    System.out.println("Your name is " + lengthOfFirstName + " letters long.");
    System.out.print("Your name starts with a " + firstName.substring(0, 1) + ".");
    System.out.println("The letter " + firstName.charAt(lengthOfFirstName / 2) + " is at the center of your name.");
    System.out.println("Your name ends with a " + firstName.charAt(lengthOfFirstName - 1) + ".");

    System.out.println("Enter your last name: ");
    String lastName = input.nextLine();

    System.out.println("Goodbye " + lastName.substring(0, findFirstVowel(lastName)) + getVowelname(firstName) + " " + firstName.substring(0, findFirstVowel(firstName)) + getVowelname(lastName + "!"));
    System.out.println("Oops I mean " + firstName + " " + lastName + "!");



  }
  public static int findFirstVowel(String inputWord) //requires parameter inputWord
  {
    String Vowels = "aeiouy";
    int tempCounter = 0;

    while (tempCounter < inputWord.length()) {
      if (Vowels.contains(inputWord.substring(tempCounter, tempCounter+1))){
        return tempCounter;
      }
      tempCounter++;
    }
    return 0; 

  }

  public static String getVowelname(String word){
    String newWord = word.substring(findFirstVowel(word), word.length());

    return newWord;
  }

}