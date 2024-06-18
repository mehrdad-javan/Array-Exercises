package se.lexicon;

public class Exercise05 {

    public static void main(String[] args) {
        String[][] twoD = new String[2][2];
        String[] arr = {"France", "Paris", "Sweden", "Stockholm"};
        int index = 0;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD.length; j++) {
                twoD[i][j] = arr[index];
                index++;
            }
        }

        System.out.println(twoD[0][0] + ", " + twoD[0][1]);
        System.out.println(twoD[1][0] + ", " + twoD[1][1]);
    }
}