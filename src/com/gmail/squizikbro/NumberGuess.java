package com.gmail.squizikbro;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuess {
    public static void main(String[] args) {

        int value = ThreadLocalRandom.current().nextInt(11);
        int attemptsSum = 0;
        int attempt = 0;

        Scanner number = new Scanner(System.in);

        do {
            attemptsSum++;
            System.out.println("Guess the number ");
            attempt = number.nextInt();
        }
        while (attempt != value && attemptsSum <= 3);

        if (attempt == value) {
            System.out.println("Congratulations! You have won!");
        } else {
            System.out.println("Sorry, game over");
        }
    }
}
