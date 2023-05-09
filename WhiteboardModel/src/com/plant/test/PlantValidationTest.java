package com.plant.test;

import com.plant.Plant;
import com.plant.PlantColor;

import static com.plant.PlantColor.*;

class PlantValidationTest {

    public static void main(String[] args) {

        Plant p4 = new Plant("Alocasia cuprea", true, RED, false);
        System.out.println();

        p4.setHeight(0);
        System.out.println(p4);
        System.out.println();

        p4.setHeight(500);
        System.out.println(p4);
        System.out.println();

        p4.setHeight(-1);
        System.out.println(p4);
        System.out.println();

        p4.setHeight(501);
        System.out.println(p4);
    }
}