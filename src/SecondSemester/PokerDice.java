// package src.SecondSemester;

/*
 * PokerDice.java
 * 
 *   A program that plays and scores a round of the game Poker Dice.  In this game,
 *   five dice are rolled.  The player is allowed to select a number of those five dice
 *   to re-roll.  The dice are re-rolled and then scored as if they were a poker hand.  
 *   The following hands MUST be scored in this assignment:
 *   	* High card
 *   	* One Pair
 *   	* Two Pair
 *   	* Three of a Kind
 *   	* Full House
 *   	* Four of a Kind
 *   	* Five of a Kind
 *   For an extra challenge, you may also implement:
 *   	* Straight
 * 
 * @author Gargaar Osman
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner playAgain = new Scanner(System.in);

        int[] dice = new int[5];
        boolean flag = true;

        while (flag) {
            rollDice(dice);
            promptForReroll(dice, input);

            System.out.println("Keeping remaining dice...");
            System.out.println("Rerolling");

            rollDice(dice);
            System.out.println("Your final dice: " + diceToString(dice));
            System.out.println(getResult(dice));

            flag = promptForPlayAgain(playAgain);
            resetDice(dice);
        }
        System.out.println("Goodbye!");

    }

    private static void resetDice(int[] dice) {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = 0;
        }
    }

    private static void rollDice(int[] dice) {
        Random rand = new Random();
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 0) {
                dice[i] = rand.nextInt(6 - 1 + 1) + 1;
            }
        }
    }

    private static String diceToString(int[] dice) {
        String diceString = "";
        for (int i = 0; i < dice.length; i++) {
            diceString = diceString + dice[i] + " ";
        }
        return diceString;
    }

    private static void promptForReroll(int[] dice, Scanner inScanner) {
        int index;

        boolean flag = true;

        while (flag) {
            System.out.println("Your current dice: " + diceToString(dice));
            System.out.print("Select a die to re-roll (-1 to keep remaining dice): ");

            index = inScanner.nextInt();
            if (index == -1) {
                flag = false;
                break;
            } else if (index < dice.length && index >= 0) {
                dice[index] = 0;
            }
        }
    }
    private static boolean promptForPlayAgain(Scanner inScanner) {
        boolean playAgain;

        while (true) {
            System.out.print("Would you like to play again [Y/N]?: ");

            String userInput = inScanner.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                playAgain = true;
                break;

            } else if (userInput.equalsIgnoreCase("n")) {
                playAgain = false;
                break;

            } else {
                System.out.println("ERROR! Only 'Y' or 'N' allowed as input!");
            }
        }
        return playAgain;
    }

    // Given an array of integers, determines the result as a hand of Poker Dice.
    // The
    // result is determined as:
    // * Five of a kind - all five integers in the array have the same value
    // * Four of a kind - four of the five integers in the array have the same value
    // * Full House - three integers in the array have the same value, and the
    // remaining two
    // integers have the same value as well (Three of a kind and a pair)
    // * Three of a kind - three integers in the array have the same value
    // * Two pair - two integers in the array have the same value, and two other
    // integers
    // in the array have the same value
    // * One pair - two integers in the array have the same value
    // * Highest value - if none of the above hold true, the Highest Value in the
    // array
    // is used to determine the result
    //
    // The method should evaluate the array and return back to the calling program a
    // String
    // containing the score from the array of dice.
    //
    // EXTRA CHALLENGE: Include in your scoring a Straight, which is 5 numbers in
    // sequence
    // [1,2,3,4,5] or [2,3,4,5,6] or [3,4,5,6,7] etc..
    private static String getResult(int[] dice) {
        String result = "";
        int threeKind, twoPair, highestValue;
        threeKind = 0;
        twoPair = 0;
        highestValue = 0;

        int[] hand = getCounts(dice);

        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == 2) {
                twoPair++;

            }
            if (twoPair == 1) {
                result = "One pair!";

            } else if (twoPair == 2) {
                result = "Two pair!";
            }

            if (hand[i] == 3) {
                threeKind++;

            }
            if (threeKind == 1) {
                result = "Three of a kind!";

            }if (threeKind == 1 && twoPair == 1) {
                result = "Full house!";
            }
            if (hand[i] == 4) {
                result = "Four of a kind!";

            } else if (hand[i] == 5) {
                result = "Five of a kind!";

            }

        }
        if (result == "") {
            for (int i = 0; i < dice.length; i++) {
                if (dice[i] > highestValue) {
                    highestValue = dice[i];
                }
            }
            result = "Highest Card " + highestValue;
        }

        return result;
    }

    // Given an array of integers as input, return back an array with the counts of
    // the
    // individual values in it. You may assume that all elements in the array will
    // have
    // a value between 1 and 10. For example, if the array passed into the method
    // were:
    // [1, 2, 3, 3, 7]
    // Then the array of counts returned back by this method would be:
    // [1, 1, 2, 0, 0, 0, 1, 0, 0, 0]
    // (Where index 0 holds the counts of the value 1, index 1 holds the counts of
    // the value
    // 2, index 2 holds the counts of the value 3, etc.)
    // HINT: This method is very useful for determining the score of a particular
    // hand
    // of poker dice. Use it as a helper method for the getResult() method above.
    private static int[] getCounts(int[] dice) {
        int firstOutcome = 0;
        int secondOutcome = 0;
        int thirdOutcome = 0;
        int fourthOutcome = 0;
        int fifthOutcome = 0;
        int sixthOutcome = 0;

        int[] count = new int[6];

        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                firstOutcome++;
            } else if (dice[i] == 2) {
                secondOutcome++;
            } else if (dice[i] == 3) {
                thirdOutcome++;
            } else if (dice[i] == 4) {
                fourthOutcome++;
            } else if (dice[i] == 5) {
                fifthOutcome++;
            } else if (dice[i] == 6) {
                sixthOutcome++;
            }

        }
        count[0] = firstOutcome;
        count[1] = secondOutcome;
        count[2] = thirdOutcome;
        count[3] = fourthOutcome;
        count[4] = fifthOutcome;
        count[5] = sixthOutcome;

        return count;
    }
}