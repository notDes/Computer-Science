import java.util.Scanner;

public class kingsIsland
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numberOfPeople;
		double parkingCost;
		double foodCost;
		double ticketCost;
		double totalCost;
		double costPerPerson;
    
		System.out.print("Enter the number of people:");
		numberOfPeople = input.nextInt();
    

		System.out.print("Enter the cost for parking:");
		parkingCost = input.nextDouble();
		
		
		System.out.print("Enter the cost for food:");
		foodCost = input.nextDouble();
		
		ticketCost = 32.99;

		double totalTicketCost = ticketCost * numberOfPeople;


		totalCost = totalTicketCost + foodCost + parkingCost; // use this in results
		


		costPerPerson = totalCost / numberOfPeople; // use this in results

		// Display results

		System.out.println("King's Island Cost Report");

		System.out.println("Total Cost: $" + totalCost);
		
		System.out.println("Cost Per Person:" + " $" + costPerPerson);

		
	}
}
