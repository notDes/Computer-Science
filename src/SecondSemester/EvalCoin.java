/*  Prompt the user for the number of coin flips.
Flip the count the designated number of times - displaying the number of the coin flip and the result
Display the number of coin heads and number of tails!

How many flips would you like? 4
1. heads
2. tails
3. heads
4. heads

The results:
3 heads - 75.0%
1 tails - 25.0%
*/

import java.util.*;

public class EvalCoin
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("How many flips would you like? ");
		int numberOfFlips = input.nextInt();

		Coin Coin = new Coin("Quarter", 1995);
		int tailsCounter = 0;
		int headsCounter = 0;

		for(int i = 0; i < numberOfFlips; i++){
			Coin.flip();
			if(Coin.getFace() == "tails"){
				tailsCounter++;
			}else{
				headsCounter++;
				}
			}
		System.out.println("The results:");
		double headsPercent = 0;
		double tailsPercent = 0;

		headsPercent =  (1.0 * headsCounter / numberOfFlips) * 100 ;

		tailsPercent = (1.0 * tailsCounter / numberOfFlips) * 100;
		
		System.out.println(headsCounter + " heads - " + headsPercent + "%" );
		System.out.println(tailsCounter + " tails - " + tailsPercent + "%");

	}
}