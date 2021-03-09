package SecondSemester;

import java.util.Random;
import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random random = new Random();
        final int LENGTH = 10;
        int[] initalRandomArray = new int[LENGTH];

        for (int i = 0; i < 10; i++) {
            int genNum = random.nextInt(100);
            initalRandomArray[i] = genNum;
        }

        System.out.print("Initial random array = " + Arrays.toString(initalRandomArray));
        int minimum = initalRandomArray[0];

        for (int i = 1; i < initalRandomArray.length; i++) {
            if (initalRandomArray[i] < minimum) {
                minimum = initalRandomArray[i];
            }
        }

        System.out.println("");
        System.out.println("Smallest value = " + minimum);

        int sum = 0;

        for (int i = 0; i < initalRandomArray.length; i++) {
            sum = sum + initalRandomArray[i];
        }

        System.out.println("Sum = " + sum);
        int smallNum = sum - minimum;
        System.out.println("Sum without smallest = " + smallNum);

        int R = 1;

        for (int i = 0; i < R; i++) {
            int lastNumber = initalRandomArray[initalRandomArray.length - 1];

            for (int j = initalRandomArray.length - 1; j > 0; j--) {
                initalRandomArray[j] = initalRandomArray[j - 1];
            }

            initalRandomArray[0] = lastNumber;
        }

        System.out.print("Shifted elements = " + Arrays.toString(initalRandomArray));

        for (int i = 0; i < initalRandomArray.length; i++) {
            if (initalRandomArray[i] % 2 == 0) {
                initalRandomArray[i] = 0;
            }
        }
        System.out.println("Even values replaced =" + Arrays.toString(initalRandomArray));
    }
}