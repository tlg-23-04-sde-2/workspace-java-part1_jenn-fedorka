package com.panion;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jenn", LocalDate.of(1986, 4,18));

        System.out.println(p1);

        System.out.println("Name = " + p1.getName() + "," + " Age =" + p1.getAge());
        System.out.printf("%S is %S years old.\n", p1.getName(), p1.getAge());










    }
}