package SecondSemester;
import java.util.Scanner;


public class WhileLoops {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Gimme a positive integer: ");
    int posInt = input.nextInt();
    int num = 0;
    System.out.println(" ");

    System.out.print("Squares less than " + posInt + " = ");

    while (num * num < posInt) {
      int square = num * num;
      num++;
      System.out.print(" " + square);
    }
    System.out.println(" ");
    System.out.print("Tens less than " + posInt + " = ");

    num = 1;
    while (num * 10 < posInt) {
      int ans = num * 10;
      System.out.print(" " + ans);
      num++;

    }
    System.out.println(" ");
    System.out.print("Powers of two less than " + posInt + " = ");

    num = 1;
    while (num < posInt) {
      System.out.print(num + " ");
      num = num * 2;
    }

  }
}