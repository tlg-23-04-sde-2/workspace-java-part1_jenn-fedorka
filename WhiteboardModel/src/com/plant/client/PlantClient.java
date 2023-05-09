package com.plant.client;

import com.plant.Plant;
import com.plant.PlantColor;

import static com.plant.PlantColor.*;

class PlantClient {

    public static void main(String[] args) {

        //Create instance of plant1
        Plant p1 = new Plant("Alocasia", true, RED, false);
        System.out.println();

        //Care for plant1
        p1.water();
        p1.fertilize();
        p1.prune();
        System.out.println();

        //Create instance of plant2
        Plant p2 = new Plant("Calathea", GREEN);

        //care for plant2
        p2.water();
        p2.fertilize();
        p2.prune();
        System.out.println();

        //Create instance of plant3
        Plant p3 = new Plant();
        p3.setName("Monstera");
        p3.setHasFlower(true);
        p3.setDisplay(GREEN);
        p3.setVeriegated(true);

        //care for plant3
        p3.water();
        p3.fertilize();
        p3.prune();
        System.out.println();

        //describe plants
        System.out.println(p1);
        System.out.println();

        System.out.println(p2);
        System.out.println();

        System.out.println(p3);
    }

}