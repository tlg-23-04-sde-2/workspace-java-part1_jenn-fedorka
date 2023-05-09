package com.panion;


import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class.
 * More accurately it's a class definition writing in such a way that instances of it
 * (Person objects) can't have their properties changed once created.
 * in the code it simply means no public setters.
 */

//Method
class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }


    //no setters- read only
    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    /*
     * Returns persons age in whole years
     */

    public int getAge(){
        //HINT: See a class m package java.time that can help you return the period between two dates
        return Period.between(getBirthday(), LocalDate.now()).getYears();

    }

    @Override
    public String toString() {
        return String.format("Person: name = %S, birthday= %S", getName(), getBirthday());
    }
}