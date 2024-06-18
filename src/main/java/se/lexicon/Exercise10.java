package se.lexicon;

public class Exercise10 {

    public static void main(String[] args) {
        int size = 10;
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("\t" + table[i][j]);
            }
            System.out.println();
        }
    }
}
