package SecondSemester;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaToppings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Cheese");
        myList.add("Pineapple");
        myList.add("Olive");
        myList.add("Chicken");
        myList.add("Pepperoni");
        System.out.println("Displaying the list using the toString method...");
        System.out.println(myList.toString());


        System.out.print("Gimme a new pizza topping to add to the list: ");
        String userString = input.nextLine();

        for(int i = 0; i < myList.size(); i++){
            if(!myList.contains(userString)){
                System.out.println("Using the add method to add " + userString + " at index 2.");
                System.out.println("All values are shifted and " + userString + " is inserted at index 2.");
                myList.set(2, userString);
                System.out.println("The new list is displayed using the toString method...");
            }else{
                System.out.println("This topping is already in the list");
            }
        } System.out.print(myList.toString());

        System.out.print("Gimme a pizza topping to remove from the list: ");
        for(String removeTopping: myList){
            removeTopping = input.nextLine();
        }
    }
}
