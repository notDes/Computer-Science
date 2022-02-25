package src.Classes;

public class Input {
    public static void main(String[] args) {
        // countLetter(_something2, _something);
        // countVowels(vowels);
    }
    private static int findLargest(int num1, int num2, int num3) {
        int largest = 0;

        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
        } else if (num3 > num1 && num3 > num2) {
            largest = num3;
        }
        return largest;
    }

    private static int countLetter(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                
            }
        }
        return count;
    }

    private static int countVowels(String vowels) {

    }
}