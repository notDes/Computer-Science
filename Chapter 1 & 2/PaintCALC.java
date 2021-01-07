import java.util.Scanner;


class PaintCALC {
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

    ttlSquareFeet = (2 * length * height) + (2 * width * height) - (doors * numberOfDoors) - (windows * numberOfWindows);
    System.out.println(); // line break
    System.out.printf("%16s%9s%6.2f%13s\n", "Total Square Feet =  ", " ", ttlSquareFeet, " square feet");

    int numberOfGallons = (int) ttlSquareFeet / 300;
    int leftOverSpace = (int) ttlSquareFeet % 300;
    int quarts = leftOverSpace / 75;

    // System.out.println(numberOfGallons);
    // System.out.println(leftOverSpace);
    // System.out.println(quarts);

    if (numberOfGallons > 1) {
      System.out.printf("%16s%14d%8s\n", "If gallons only =", numberOfGallons + 1, " gallons");
    } else {
      System.out.printf("%16s%14d%7s\n", "If gallons only =", numberOfGallons + 1, " gallon");
    }

    if (quarts > 0) {
      if (numberOfGallons > 1) {
        System.out.printf("%21s%5d%7s%2d%6s\n", "If quarts are available = ", numberOfGallons, " gallons and", quarts + 1, " quarts");
      } else {
        System.out.printf("%21s%5d%7s%2d%6s\n", "If quarts are available = ", numberOfGallons, " gallon and", quarts + 1, " quarts");

      }
    } else {
      if (numberOfGallons > 1) {
        System.out.printf("%21s%5d%7s%2d%6s\n", "If quarts are available = ", numberOfGallons, " gallons and", quarts + 1, " quart");
      } else {
        System.out.printf("%21s%5d%7s%2d%6s\n", "If quarts are available = ", numberOfGallons, " gallon and", quarts + 1, " quart");
      }
    } 
  }
}