import java.util.Scanner;

public class KingsIsland
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// Declare variables for number of people, parking cost,
		// food cost, ticket cost, total cost, and cost per person
		int numberOfPeople;
		double parkingCost;
		double foodCost;
		double ticketCost;
		double totalCost;
		double costPerPerson;
    
		// Prompt for and collect input for number of people in 
		// the group.
		// Hint: use input.nextInt() to collect an integer number
		System.out.print("Enter the number of people:");
		numberOfPeople = input.nextInt();
    
		// Prompt for and collect input for cost of parking
		// for example, $5.50
		System.out.print("Enter the cost for parking:");
		parkingCost = input.nextDouble();


		
		
		// Prompt for and collect amount spent on food
		// for example, $15.75
		System.out.print("Enter the cost for food:");
		foodCost = input.nextDouble();
		
		
		// Calculate the total expenses. Each ticket is $32.99
		ticketCost = 32.99;

		double totalTicketCost = ticketCost * numberOfPeople;

		// System.out.print(totalTicketCost); debugging

		totalCost = totalTicketCost + foodCost + parkingCost; // use this in results
		
		// Calculate the average cost per person


		costPerPerson = totalCost / numberOfPeople; // use this in results

		// Display results

		System.out.println("King's Island Cost Report");

		System.out.println("Total Cost: $" + totalCost);
		
		System.out.println("Cost Per Person:" + " $" + costPerPerson);

		
	}
}