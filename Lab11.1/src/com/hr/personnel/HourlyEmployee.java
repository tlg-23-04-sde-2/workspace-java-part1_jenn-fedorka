package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    //instance variables
    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); //delegate to superclass for constructor
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours ){
        this (name, hireDate); //delegate to neighbor constructor for name and hiredate
        setRate(rate);  //delegate to setters for validation conversion
        setHours(hours); //ditto

    }

    //business methods

    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        double taxes = getRate()*getHours()*HOURLY_TAX_RATE;
        System.out.println(getName() + " is paid taxes of " + taxes);
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString (){
        return super.toString() + ", Rate = " + getRate() + "Hours = " + getHours();
    }
}