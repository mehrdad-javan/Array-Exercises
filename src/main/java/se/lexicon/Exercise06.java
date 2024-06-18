package se.lexicon;

import java.text.DecimalFormat;

public class Exercise06 {

    public static void main(String[] args) {
        double[] forAverage = {43, 5, 23, 17, 2, 14};
        double total = 0;

        for (double v : forAverage) {
            total += v;
        }

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("Average is: " + df.format(total / forAverage.length));
    }
}