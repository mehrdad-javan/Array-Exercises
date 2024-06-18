package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise11 exercise = new Exercise11();
        int[] array = new int[0];

        System.out.println("Enter a series of integers. Enter -1 to end the series.");

        while (true) {
            System.out.print("Next integer > ");
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            array = exercise.addToArray(array, input);
        }

        System.out.println("The array as entered is: " + Arrays.toString(array));

        array = exercise.reverseArray(array);
        System.out.println("The reversed array is: " + Arrays.toString(array));
    }

    private int[] addToArray(final int[] source, int number) {
        int[] newArray = Arrays.copyOf(source, source.length + 1);

        newArray[newArray.length - 1] = number;
        return newArray;
    }

    private int[] reverseArray(int[] source) {
        int[] newArray = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            newArray[i] = source[source.length - 1 - i];
        }

        return newArray;
    }
}