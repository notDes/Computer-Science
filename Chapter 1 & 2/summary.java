import java.awt.Rectangle;

import java.time.LocalDate;

import java.util.Random; 

public class Summary {
    
	public static void main(String[] args)
	{
        // 4) Write MULTIPLE output statements that will produce a smiley face
        System.out.print("ʕ");
        System.out.print("•́");
        System.out.print("ᴥ");
        System.out.print("•̀");
        System.out.print("ʔ");
        System.out.print("っ");



		// 5) Write a program that constructs a Rectangle object square with
		//    top-left corner (100, 100) and side length 200, prints its location,
		//    applies the grow and translate methods, and prints the location again.
		//    The calls to grow and translate should modify the square so that it
		//    has half the width and half the length, and is centered in the
		//    original square.
		

		Rectangle square = new Rectangle(100, 100, 200, 200);
		System.out.print(square);
		square.grow(-50,50);
		square.translate(-25, -25);
		System.out.println(square);

        


		// 6) Simulate a dice roll. Generate and print a random integer between 1 and 6, inclusive.
		int max = 6;
		int min = 1;
		Random rand = new Random();
		int randomNumber = min + rand.nextInt(max);
		System.out.println("The dice landed on..." + randomNumber);


		// 7) Pick a random HS year. Generate and print a random integer between 9 and 12, inclusive.
		Random rand2 = new Random();
		int randomYear = rand2.nextInt(3) + 9;
		System.out.println("Your HS year was..." + randomYear);



		// 8) Display the day of the week that Mr. Riley's birthday (June 15th) was on this year.
		LocalDate rileyBirthday = LocalDate.of(2020,6,15); 
		String weekday = rileyBirthday.getDayOfWeek().toString();
		System.out.println(weekday);


		


        // 9) Calculate and display the number of letters in the word "Bradley".
        String Bradley = "Bradley";
		    int Length_Bradley = Bradley.length();
		    System.out.println(Length_Bradley);


		// 10) Finally, visit http://patorjk.com/software/taag/ to get a fancy ASCII art version of your LAST name. For example, Amy Brown would print Brown. Use println statements to print your ASCII art last name.
		System.out.println(" ____  ____  _      ____  _ ");
		System.out.println("/  _ \\/ ___\\/ \\__/|/  _ \\/ \\  /|");
		System.out.println("| / \\||    \\| |\\/||| / \\|| |\\ ||");
		System.out.println("| \\_/|\\___ || |  ||| |-||| | \\||");
		System.out.println("\\____/\\____/\\_/  \\|\\_/ \\|\\_/  \\|");

		


	}
}


// When finished, submit to replit classroom AND ALSO SUBMIT "DONE" TO CANVAS