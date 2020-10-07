/*
Summary of Chapters 1 & 2
*/

// 1) Write the import statement for the Rectangle class
import java.awt.Rectangle;


// 2) Write the import statement for the Random class
import java.awt.Random;


// 3) Write the import statement needed for question 8 (below)
public class Summary {
    
	public static void main(String[] args)
	{
        // 4) Write MULTIPLE output statements that will produce a smiley face
        System.out.println();


		// 5) Write a program that constructs a Rectangle object square with
		//    top-left corner (100, 100) and side length 200, prints its location,
		//    applies the grow and translate methods, and prints the location again.
		//    The calls to grow and translate should modify the square so that it
		//    has half the width and half the length, and is centered in the
		//    original square.
		
		int x = 100;
		int y = 100;
		int sideLength = 200;

		Rectangle square = new Rectangle(x, y, sideLength, sideLength);
		System.out.println(square);

		int growTranslate = (sideLength / 2);

		square.translate(growTranslate, growTranslate);
		square.grow(growTranslate, growTranslate);
		System.out.println(square);

        


		// 6) Simulate a dice roll. Generate and print a random integer between 1 and 6, inclusive.


		// 7) Pick a random HS year. Generate and print a random integer between 9 and 12, inclusive.


		// 8) Display the day of the week that Mr. Riley's birthday (June 15th) was on this year.


		// 9) Calculate and display the number of letters in the word "Bradley".


		// 10) Finally, visit http://patorjk.com/software/taag/ to get a fancy ASCII art version of your LAST name. For example, Amy Brown would print Brown. Use println statements to print your ASCII art last name.


	}
}


// When finished, submit to replit classroom AND ALSO SUBMIT "DONE" TO CANVAS