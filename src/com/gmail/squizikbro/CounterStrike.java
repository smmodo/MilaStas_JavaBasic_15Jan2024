package com.gmail.squizikbro;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("First team name: ");
        String teamDonkey = scanner.nextLine();
        System.out.println("Player 1 " + teamDonkey);
        int donkeyFirstPlayer = scanner.nextInt();
        System.out.println("Player 2 " + teamDonkey);
        int donkeySecondPlayer = scanner.nextInt();
        System.out.println("Player 3 " + teamDonkey);
        int donkeyThirdPlayer = scanner.nextInt();
        System.out.println("Player 4 " + teamDonkey);
        int donkeyFourthPlayer = scanner.nextInt();
        System.out.println("Player 5 " + teamDonkey);
        int donkeyFifthPlayer = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Second team name: ");
        String teamElephant = scanner.nextLine();
        System.out.println("Player 1 " + teamElephant);
        int elephantFirstPlayer = scanner.nextInt();
        System.out.println("Player 2 " + teamElephant);
        int elephantSecondPlayer = scanner.nextInt();
        System.out.println("Player 3 " + teamElephant);
        int elephantThirdPlayer = scanner.nextInt();
        System.out.println("Player 4 " + teamElephant);
        int elephantFourthPlayer = scanner.nextInt();
        System.out.println("Player 5 " + teamElephant);
        int elephantFifthPlayer = scanner.nextInt();

        int playersTotal = 5;
        double averageScoreDonkey = (double) (donkeyFirstPlayer + donkeySecondPlayer + donkeyThirdPlayer
                + donkeyFourthPlayer + donkeyFifthPlayer) / playersTotal;
        System.out.println("Donkey`s team average score:" + averageScoreDonkey);
        double averageScoreElephant = (double) (elephantFirstPlayer + elephantSecondPlayer + elephantThirdPlayer
                + elephantFourthPlayer + elephantFifthPlayer) / playersTotal;
        System.out.println("Elephant's team average score:" + averageScoreElephant);

        double precision = 0.0001;
        if (Math.abs(averageScoreDonkey - averageScoreElephant) < precision) {
            System.out.println("Draw");
        } else if (averageScoreDonkey - averageScoreElephant > precision) {
            System.out.println("Team winner is " + teamDonkey + " gets " + averageScoreDonkey);
        } else {
            System.out.println("Team winner is " + teamElephant + " gets " + averageScoreElephant);
        }

    }
}
