/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);


        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1800.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 12.5, 50));
        dept.addEmployee(new SalariedEmployee("Jacob", LocalDate.of(2012,01,13), 1500.0));
        dept.addEmployee(new HourlyEmployee("Justin", LocalDate.of(1990,01,31), 35.0, 40));
        dept.addEmployee(new Executive("Jennifer", LocalDate.of(1986,4,18), 150_000.0));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //pay all employees
        System.out.println("\nPay all employees:");
        dept.payEmployees();

        //forced holiday break
        System.out.println("\nForced holiday break:");
        dept.holidayBreak();
    }
}