package src.SecondSemester;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaToppings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList < String > myList = new ArrayList < String > ();

        myList.add("Cheese");
        myList.add("Pineapple");
        myList.add("Olive");
        myList.add("Chicken");
        myList.add("Pepperoni");
        System.out.println("Displaying the list using the toString method...");
        System.out.println(myList.toString());

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Gimme a new pizza topping to add to the list: ");
            String userString = input.nextLine();

            if (!myList.contains(userString)) {
                System.out.println("Using the add method to add " + userString + " at index 2.");
                System.out.println("All values are shifted and " + userString + " is inserted at index 2.");
                myList.set(2, userString);

                System.out.println("The new list is displayed using the toString method...");
                break;

            } else {
                System.out.println("This topping is already in the list");
                break;
            }

        }
        System.out.println(myList.toString());

        boolean flag = true;
        boolean isInArray = false;

        while (flag) {
            System.out.println("Gimme a pizza topping to remove from the list (Type quit to QUIT): ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("QUITTING...");
                flag = false;
                break;
            }
            for (String x: myList) {
                if (userInput.equalsIgnoreCase(x)) {
                    isInArray = true;
                }
            }
            if (isInArray) {
                int index = myList.indexOf(userInput);
                myList.remove(index);
                System.out.println(myList.toString());
                isInArray = false;

            } else {
                System.out.println(userInput + " IS NOT IN THE LIST.");
                System.out.println(myList.toString());

            }
        }

        System.out.println("Displaying the list using the toString method..." + myList.toString());
        myList.clear();

    }
}