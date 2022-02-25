// package src.SecondSemester;


import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first wordlist: ");
    ArrayList < String > firstWordList = getList(input);

    System.out.println("Enter the second wordlist:");
    ArrayList < String > secondWordList = getList(input);

    System.out.println("Wordlist 1");
    System.out.println("----------");
    displayList(firstWordList);

    System.out.println("Wordlist 2");
    System.out.println("----------");
    displayList(secondWordList);

    System.out.println("List 1 merged with list 2");
    System.out.println("-------------------------");
    displayList(mergeLists(firstWordList, secondWordList));

    System.out.println("List 2 merged with list 1");
    System.out.println("-------------------------");
    displayList(mergeLists(secondWordList, firstWordList));

  }

  private static ArrayList getList(Scanner inScanner) {
    boolean flag = true;

    ArrayList < String > list = new ArrayList < String > ();

    while (flag) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a word ('XXX' to quit): ");
      String userInput = input.nextLine();

      if (userInput.equalsIgnoreCase("xxx")) {
        flag = false;
        break;
      } else {
        list.add(userInput);
      }
    }
    return list;
  }

  private static void displayList(ArrayList myList) {
    for (int i = 0; i < myList.size(); i++) {
      String result = i + ": " + myList.get(i);

      System.out.println(result);
    }
  }

  private static ArrayList mergeLists(ArrayList list1, ArrayList list2) {
    ArrayList < String > mergeList = new ArrayList < String > ();

    String Map;
    String Map2;
    String list;

    for (int i = 0; i < list1.size() || i < list2.size(); i++) {
      Map = (String) list1.get(i);
      Map2 = (String) list2.get(i);

      if (i < list1.size() && i < list2.size()) {

        mergeList.add(Map);
        mergeList.add(Map2);

      } else if (i < list1.size() && i >= list2.size()) {
        mergeList.add(Map);

      } else if (i >= list1.size() && i < list2.size()) {
        mergeList.add(Map2);
      }
    }
    return mergeList;
  }
}