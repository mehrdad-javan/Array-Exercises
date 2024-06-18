package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

    public static void main(String[] args) {
        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        System.out.println("Unsorted Array:\t" + Arrays.toString(cities));

        Arrays.sort(cities);

        System.out.println("  Sorted Array:\t" + Arrays.toString(cities));
    }
}