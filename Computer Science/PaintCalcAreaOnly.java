import java.util.Scanner;


class Paint {
    public static void main(String[] args) {
      // System.out.println("Hello world!"); starter code 

      Scanner input = new Scanner(System.in);

      int length; 
      int width;
      int height;
      int numberOfDoors;
      int numberOfWindows;
      
      // LENGTH
      System.out.print("Please enter the length of the room:");
      length = input.nextInt();
      // System.out.println(length); debugging

      // WIDTH
      System.out.print("Please enter the width of the room:");
      width = input.nextInt();

      // HEIGHT
      System.out.print("Please enter the height of the room:");
      height = input.nextInt();

      // # DOORS
      System.out.print("How many doors does the room have:");
      numberOfDoors = input.nextInt();

      // # WINDOWS
      System.out.print("How many windows does the room have:");
      numberOfWindows = input.nextInt();

      int ttlSquareFeet;
      int doors;
      int windows;
      doors = 21;
      windows = 12;

      ttlSquareFeet = (2 * length * height ) + (2 * width * height) - (doors * numberOfDoors) - (windows * numberOfWindows);
      System.out.println(); // line break
      System.out.println("Total square feet = " + ttlSquareFeet + " Square Feet");

    }
  }

