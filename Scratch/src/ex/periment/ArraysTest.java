package ex.periment;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int [] ages = new int[3];
        ages[0] = 37;
        ages[1] = 33;
        ages[2] = 11;

        System.out.println(Arrays.toString(ages));

        double [] temps = {64.0, 79.5, 39.5, 80.7, 49.0};
        for (double temp : temps) {
            System.out.println("the temperature is " + temp);
        }

        System.out.println();
        for (int i = 0; i < temps.length; i++){
            System.out.println("the temperature is " + temps[i]);

        }

    }


}