import java.util.Scanner;

/**
   This class prints prime numbers.
*/
public class PrimePrinter {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter upper limit: ");
      int limit = in .nextInt();

      for (int i = 1; i < limit; i++) {
         if (isPrime(i)) {
            System.out.println(i + " is Prime.");
         }
      }

      // loop
      // call the isPrime method to check every number up to the limit
      // only print a number if it is prime
   }

   /**
	 Checks to see if a given number is prime.
   @param n an integer that may or may not be prime
	 @return true or false
   */
   public static boolean isPrime(int n) {
      for (int i = 2; i < n; i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
      // Need`s implemented. Recall that a number is a prime number if it is not divisible by any number except 1 and itself.
      // Check every number between 1 and n
      // Use modulus to determine if n is divisible by some number

   }

}