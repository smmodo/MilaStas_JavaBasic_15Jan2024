package com.gmail.squizikbro;

//Зробити клас Person та в ньому метод personInfo()
//На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//Всередині методу формувати рядок у форматі:
// Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//Метод має повертати String
//У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//Повинен вийти висновок такого типу:
//Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.
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