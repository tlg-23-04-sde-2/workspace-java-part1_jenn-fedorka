package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //instance vairables
    private double salary;


    //Constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        //enrollIn401k();

    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary){
        this(name, hireDate); //delegate to neighbor constructor
        setSalary(salary); // delegate to setter
    }

    //Action or business methods
    public void takeVacation(){
        System.out.println(getName() + " is on vacation.");
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override
    public void payTaxes() {
        double taxes = getSalary()* SALARIED_TAX_RATE;
        System.out.println( getName() + " is paid taxes of " + taxes);
    }

    //accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary = " + getSalary();
    }
}