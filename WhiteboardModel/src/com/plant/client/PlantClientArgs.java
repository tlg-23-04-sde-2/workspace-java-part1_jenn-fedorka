package com.plant.client;

import com.plant.Plant;
import com.plant.PlantColor;

import java.util.Arrays;

class PlantClientArgs {

    public static void main(String[] args) {
        //Check the presence of arguments
        if (args.length < 5) {
            String usage = "Usage: java PlantClientArgs <name> <hasFlower> <display> <isVerigated> <height>";
            String example = "Example java PlantClientArgs Calathea lietzei true RED true 37.5 ";
            String note1 = "Note: supported colors are" + Arrays.toString(PlantColor.values());
            String note2 = "Height must be between " + Plant.MIN_HEIGHT + " and " + Plant.MAX_HEIGHT;
            System.out.println();

            System.out.println(usage);
            System.out.println();

            System.out.println(example);
            System.out.println();

            System.out.println(note1);
            System.out.println();

            System.out.println(note2);
            return;
        }

        //convert arguments into proper data types
        String name = args[0];
        boolean hasFlower = Boolean.parseBoolean(args[1]);
        PlantColor display = PlantColor.valueOf(args[2].toUpperCase());
        boolean isVerigated = Boolean.parseBoolean(args[3]);
        double height = Double.parseDouble(args[4]);

        //Create plant object
        Plant p = new Plant(name, hasFlower, display, isVerigated, height);

        //print
        System.out.println(p);

    }
}