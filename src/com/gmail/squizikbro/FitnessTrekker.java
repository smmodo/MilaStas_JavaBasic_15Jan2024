package com.gmail.squizikbro;

public class FitnessTrekker {
    private static final int CURRENT_YEAR = 2024;
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String telNumber;
    private final String eMail;
    private String surname;
    private int weight;
    private String pressure;
    private int daySteps;
    private int age;

    public FitnessTrekker(String name, int birthDay, int birthMonth, int birthYear, String telNumber,
                          String eMail, String surname, int weight, String pressure, int daySteps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.telNumber = telNumber;
        this.eMail = eMail;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.daySteps = daySteps;
        this.age = CURRENT_YEAR - this.birthYear;

    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getDaySteps() {
        return daySteps;
    }

    public void setDaySteps(int daySteps) {
        this.daySteps = daySteps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("name: " + name + ", birth date: " + birthDay + ", birth month: "
                + birthMonth + ", birth year " + birthYear + ", e-mail: " + eMail + ", telephone number: " + telNumber
                + ", surname: " + surname + ", current weight: " + weight + ", usual pressure: " + pressure
                + ", day steps: " + daySteps + ", current age: " + age);
    }
}

class FitnessTrekkerDemo {
    public static void main(String[] args) {
        FitnessTrekker[] fitnessTrekkers = {
                new FitnessTrekker("Ann", 12, 05, 1994,
                        "0786743398", "ann.1984@fit.com", "Annova", 58,
                        "117/75", 7087),
                new FitnessTrekker("Andrew", 30, 07, 1977,
                        "0786354123", "andrew.1977@fit.com", "Androv", 95,
                        "130/92", 6876),
                new FitnessTrekker("Tom", 28, 11, 1989,
                        "0784321098", "tom.1999@fit.com", "Tomov", 78,
                        "119/79", 9651)};

        System.out.println("User's information");
        printInfo(fitnessTrekkers);
        System.out.println("");

        FitnessTrekker ann = fitnessTrekkers[0];
        ann.setSurname("Vasilenko");
        ann.setPressure("115/70");

        FitnessTrekker andrew = fitnessTrekkers[1];
        andrew.setWeight(83);
        andrew.setDaySteps(11540);
        andrew.setPressure("120/80");

        System.out.println("User's current information");
        printInfo(fitnessTrekkers);

    }

    private static void printInfo(FitnessTrekker[] fitnessTrekkers) {
        for (FitnessTrekker fitnessTrekker : fitnessTrekkers) {
            fitnessTrekker.printAccountInfo();
        }
    }
}