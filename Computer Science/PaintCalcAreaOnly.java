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

  /*You are painting a room and need to calculate the amount of paint that must be purchased. All length and area calculations will be in feet and will be entered and stored as integers.
Prompt the user for the length, width, and height of a room.
Prompt the user for the number of doors and number of windows.
Assume that doors are 21 square feet and windows are 12 square feet.
Calculate and display the area to be painted. (NOTE: You will NOT be painting the ceiling, floors, doors or windows.)

Sample run #1:
Enter the room dimensions below:
Length: 10
Width: 20
Height: 8
How many doors does the room have: 1
How many windows does the room have: 2

Total square feet = 435 square feet

Sample run #2:
Enter the room dimensions below:
Length: 10
Width: 5
Height: 10
How many doors does the room have: 0
How many windows does the room have: 0

Total square feet = 300 square feet*/