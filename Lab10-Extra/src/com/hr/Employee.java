package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS


    //OPTION 4: try-catch and throw a different type of exception

    public void goToWork() throws WorkException{
        Car c = new Car ("jad98sda8", "Toyota", "Matrix");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work.", e);

        }
        finally {
            c.stop();
        }

    }

    //OPTION 3: try-catch react- throw back to client

//    public void goToWork() throws DestinationUnreachableException{
//        Car c = new Car ("jad98sda8", "Toyota", "Matrix");
//        c.start();
//        try {
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println("Send email to complain");
//            throw e;
//
//        }
//        finally {
//            c.stop();
//        }
//
//    }




    /*
     *OPTION 2: punt do not handle the exception
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car ("jad98sda8", "Toyota", "Matrix");
//        c.start();
//        try {
//            c.moveTo("West Seattle");
//        }
//        finally {
//            c.stop();
//        }
//
//    }

    /*
     *OPTION 1: Try- Catch and handle
     *
     */
//    public void goToWork() {
//        Car c = new Car ("jad98sda8", "Toyota", "Matrix");
//        c.start();
//        try {
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            c.stop();
//        }
//
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}