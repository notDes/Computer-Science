package Second;
import java.util.Scanner;


public class WhileLoops {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Gimme a positive integer: ");
    int posInt = input.nextInt();
    int num = 0;

    while(num * num < posInt){
    int square = num * num;
      num++;
      System.out.print(square);
    }
}
}
