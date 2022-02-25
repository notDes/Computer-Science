import java.util.Scanner;
import java.io.*;

public class Main {
  public static void main(String[] args){

    // load external file into a variable
    File myFile = new File("testData.txt");

    // Create a scanner to scan the file
    Scanner in = new Scanner(myFile);
    int firstDimensions = in .nextInt();
    int secondDimensions = in .nextInt();
    int[][] array = new int[firstDimensions][secondDimensions];

    // read the file's contents line-by-line

    try {
      while ( in .hasNextLine()) {
        for (int i = 0; i < firstDimensions; i++) {
          for (int z = 0; i < secondDimensions; i++) {
            array[i][z] = in .nextInt();
            System.out.print(array[i][z] + " ");
          }
          System.out.println();
        }
      }
    } catch (Exception e) {
      System.out.println("oops that's not an integer");
    }


    // close the scanner.
    in .close();
  }
}