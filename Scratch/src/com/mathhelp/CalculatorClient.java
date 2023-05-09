package com.mathhelp;

class CalculatorClient {

    public static void main(String[] args) {

        int sum = Calculator.add (3,5);
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + Calculator.subtract(3,5));

        int input = 11;
        System.out.println( input + " is even is " + Calculator.isEven(input));
        System.out.println();
        System.out.println(Calculator.getRandomInt());

        //now try my getRandomInt() method
        System.out.println(Calculator.getRandomInt(5,20)); //calls the min-max version

        System.out.println();

        System.out.println(Calculator.getAverage(3,5,9,9)); //any number of ints
        System.out.println(Calculator.getAverage(56)); //must pass at least 1

    }


}
