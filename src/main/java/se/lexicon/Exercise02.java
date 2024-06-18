package se.lexicon;

public class Exercise02 {

    public static void main(String[] args) {
        char[] characters = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'b', 't', 'r', 'c'};

        Exercise02 exercise = new Exercise02();
        int index = exercise.indexOf(characters, 'd');
        System.out.println("Index position of 'd' is " + index);
    }

    public int indexOf(char[] array, char character) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) {
                return i;
            }
        }

        return -1;
    }
}