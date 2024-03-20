package com.gmail.squizikbro;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String telNumber;

    public Person(String name, String surname, String city, String telNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.telNumber = telNumber;
    }

    public String personInfo() {
        return String.format("Call citizen %s %s from %s at %s", name, surname, city, telNumber);
    }
}

class PersonInfo {
    public static void main(String[] args) {
        methodOne();
    }

    private static void methodOne() {

        Person will = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(will.personInfo());
        Person sherlock = new Person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(sherlock.personInfo());
        Person jackie = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(jackie.personInfo());

    }
}
