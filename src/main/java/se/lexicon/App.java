package se.lexicon;


public class App {

    //1.Write a program which will store elements in an array of type ‘int’ and print it out. Expected output:11 23 39 etc.
    public static void ex1() {
        int[] numberArray = new int[]{38, 40, 52, 65, 67, 89, 90, 100};

        for (int k : numberArray) {
            System.out.print(k + " ");
        }
    }

    public static void ex2() {
    }

    // ...

    public static void main(String[] args) {
        ex1();
    }
}
