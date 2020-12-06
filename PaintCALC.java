import java.util.Scanner;


 class Main {
    public static void main(String[] args) {
      // System.out.println("Hello world!"); starter code 

      Scanner input = new Scanner(System.in);

      double length; 
      double width;
      double height;
      int numberOfDoors;
      int numberOfWindows;
      
      // LENGTH
      System.out.print("Please enter the length of the room:");
      length = input.nextDouble();
      // System.out.println(length); debugging

      // WIDTH
      System.out.print("Please enter the width of the room:");
      width = input.nextDouble();

      // HEIGHT
      System.out.print("Please enter the height of the room:");
      height = input.nextDouble();

      // # DOORS
      System.out.print("How many doors does the room have:");
      numberOfDoors = input.nextInt();

      // # WINDOWS
      System.out.print("How many windows does the room have:");
      numberOfWindows = input.nextInt();

      double ttlSquareFeet;
      int doors;
      int windows;
      doors = 21;
      windows = 12;

      ttlSquareFeet = (2 * length * height ) + (2 * width * height) - (doors * numberOfDoors) - (windows * numberOfWindows);
      System.out.println(); // line break
      System.out.println("Total square feet = " + ttlSquareFeet + " Square Feet");

      int numberOfGallons = (int)ttlSquareFeet / 300;

      //testing
      System.out.print(numberOfGallons);

      System.out.printf("%25s\n", "If gallons only");

    }
  }

