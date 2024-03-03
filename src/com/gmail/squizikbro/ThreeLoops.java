package com.gmail.squizikbro;

import java.util.Scanner;

public class ThreeLoops {
    public static Scanner number = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner number = new Scanner(System.in);

        System.out.println("Enter minimal value: ");
        int minimal = number.nextInt();
        System.out.println("Enter maximum value: ");
        int maximum = number.nextInt();

        if (minimal > maximum);
        {
            int temp = minimal;
            minimal = maximum;
            maximum = temp;
        }

        if (minimal == maximum) {
            System.out.printf("Minimal value must be lower");

            return;
        }

        System.out.println("Made by loop For: " + loopFor(minimal, maximum));
        System.out.println("Made by loop While: " + loopFor(minimal, maximum));
        System.out.println("Made by loop DoWhile: " + loopFor(minimal, maximum));
    }

    private static int loopFor(int minimal, int maximum) {
        int result = 0;
        for (int i = minimal; i < maximum; i++) {
            int total = 0;
            for (int number = i; number != 0; number /= 10) {
                total += number % 10;
            }
            if (total != 0 && i % total == 0) {
                result++;
            }
        }
        return result;
    }

    private static int loopWhile(int minimal, int maximum) {
        int result = 0;
        int i = minimal;
        while (i < maximum) {
            int total = 0;
            int number = i;
            while (number != 0) {
                total += number % 10;
                number /= 10;
            }
            if (total != 0 && i % total == 0) {
                result++;
            }
            i++;
        }
        return result;

    }

    private static int loopDoWhile(int minimal, int maximum) {
        int result = 0;
        int i = minimal;
        do {
            int total = 0;
            int number = i;

            do {
                total += number % 10;
                number /= 10;
            } while (number != 0);
            if (total != 0 && i % total == 0) {
                result++;
            }
            i++;
        } while (i < maximum);
        return result;
    }

    public static int nextInt() {
        while (true) {
            if (number.hasNextInt()) {
                return number.nextInt();
            }
            System.out.println("Enter ");
            number.nextInt();
        }
    }
}



