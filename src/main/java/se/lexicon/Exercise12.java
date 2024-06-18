package se.lexicon;

public class Exercise12 {

    public static void main(String[] args) {
        int[][] array2D = {
                {1, 2, 3, 4},
                {2, 4, 6, 9},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (i == j) {
                    System.out.print(array2D[i][j] + " ");
                }
            }
        }
    }
}