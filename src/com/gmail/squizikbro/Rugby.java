package com.gmail.squizikbro;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        RugbyPlayers();
    }

    public static void RugbyPlayers() {
        int ageTeamOne = 0;
        int ageTeamTwo = 0;
        for (int i = 0; i < 25; i++) {
            int age = ThreadLocalRandom.current().nextInt(18, 40);
            ageTeamOne += age;
            System.out.print(age + " ");

            age = ThreadLocalRandom.current().nextInt(18, 40);
            ageTeamTwo += age;
            System.out.println(age);
        }

        System.out.printf("Average age of team One is %.1f\n", ageTeamOne / 25.0);
        System.out.printf("Average age of team Two is %.1f\n", ageTeamTwo / 25.0);
    }
}