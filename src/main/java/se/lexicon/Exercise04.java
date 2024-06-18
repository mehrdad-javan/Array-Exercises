package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

    public static void main(String[] args) {
        int[] numbers = {11, 23, 39, 55, 24, 820};

        int[] copy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Original:\t" + Arrays.toString(numbers));
        System.out.println("    Copy:\t" + Arrays.toString(copy));
    }
}