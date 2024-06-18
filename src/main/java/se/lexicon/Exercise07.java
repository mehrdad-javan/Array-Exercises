package se.lexicon;

public class Exercise07 {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 9, 12};

        System.out.print("Array:");
        for (int j : array) {
            System.out.print(" " + j);
        }

        System.out.print("\nOdd Array:");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(" " + j);
            }
        }
    }
}