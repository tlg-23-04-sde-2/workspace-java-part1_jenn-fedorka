package com.mathhelp;/*
 * This is an all static class. contains only static methods
 */

class Calculator {

    //Add, Subtract, isEven
    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static boolean isEven( int value) {
        return value  % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 14
     * HINT: See a class called Math (in package java.lang), look for a helpful method here
     * NOTE: These methods in the MAth class are all static, which means you call them as Math.methodName()
     */

    public static int getRandomInt() {
        int result = 0; // declare return value as local variable

        double rand = Math.random(); //This is 0.00000 to 0.99999
        double scaled = (rand * 14) +1;  //0.000000 to 13.999999

        // Convert (via explicit downcast) the double to int
        result = (int) scaled;
        return result;
    }

    /*
     *This method returns the average (Arithmetic mean) of the supplied integers
     * getAverage()
     */

    public static double getAverage(int first, int... rest) {  //client can pass any number of ints 3,5,9,9
        double result = 0.0;

        double sum = first;

        for (int value : rest) {
            sum = sum + value;
        }
        result = sum / (1 + rest.length); //rest is an array

        return result;

    }



    /*
     * Returns a random integer between min and max inclusive
     */
    public static int getRandomInt(int min, int max) {
        int result = 0;
        double rand = Math.random(); //0.000 to 0.9999
        double scaled = rand*(max-min)+ min; //5.000 to 19.999
        double rounded = Math.ceil(scaled); //5.000 to 20.000
        return (int) rounded; //5 to 20

    }
}