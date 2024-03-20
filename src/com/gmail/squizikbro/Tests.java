
package com.gmail.squizikbro;

public class Tests {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();

        }

    }


}

//import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;
//

//
//        int bound = 11;
//        int value = ThreadLocalRandom.current().nextInt(bound);
//        int attemptsSum = 0;
//        int attempt = 0;
//
//        Scanner number = new Scanner(System.in);
//
//        do {
//            attemptsSum++;
//            System.out.println("Guess the number ");
//            attempt = number.nextInt();
//        }
//        while (attempt != value && attemptsSum <= 3);
//
//        if (attempt == value) {
//            System.out.println("Congratulations! You have won!");
//        } else {
//            System.out.println("Sorry, game over");
//        }
//    }
//}

//while (attempt != value || attemptsSum <= 4) {
//        System.out.println("Guess the number ");
//attempt = number.nextInt();
//attemptsSum++;
//        }
//        if (attempt == value) {
//        System.out.println("Congratulations! You have won!");
//        }
//            if (attempt == value) {
//
//                System.out.println("Congratulations! You have won!");
//            } else if (attempt != value) {
//                System.out.println("Try again");
//                int attemptTwo = number.nextInt();
//            } else {
//                System.out.println("Try again");
//                int attemptOther = number.nextInt();
//            }

//        while (attempt != value){
//            System.out.println("Guess the number: ");
//            if (attempt == value) {
//            System.out.println("Congratulations! You have won!");
//        } else {
//                int attemptTwo = number.nextInt();
//            if (attemptTwo == value) {
//                System.out.println("Congratulations! You have won");
//            } else {
//                System.out.println("Try again");
//        }
//        }
//    }


//
//
////
////        int sum = 7;
////        if (sum > 10) {
////            System.out.println("I order pizza");
////        } else if (sum > 6) {
////            System.out.println("I order burger");
////        } else
////        {
////            System.out.println("I order sandwich");
////        }
////    }
////}
//
//
////        double method1 = 99.9;
////        int value1 = (int) method1;
////        System.out.println("Integer method one - " + value1);
////
////        double method2 = 56.4;
////        int value2 = (int) Math.round(method2);
////        System.out.println("Integer method two - " + value2);
////
////        Double data = 99.5;
////        Double newData = new Double(data);
////        int value3 = newData.intValue();
////        System.out.println("Integer method three - " + value3);
////
////        int dynastyLiVoin = 13;
////        int dynastyLiLuchnik = 24;
////        int dynastyVershnyk = 46;
////        int troopsLi = 860;
////        int dynastyLiTotal = (dynastyLiVoin + dynastyLiLuchnik + dynastyVershnyk) * troopsLi;
////        System.out.println("Li total attack rate - " + dynastyLiTotal);
////
////        int dynastyMinVoin = 9;
////        int dynastyMinLuchnik = 35;
////        int dynastyMinVershnyk = 12;
////        double troopsMinCoef = 1.5;
////        int troopsMin = (int) (troopsLi * troopsMinCoef);
////        int dynastyMinTotal = (dynastyMinVoin + dynastyMinLuchnik + dynastyMinVershnyk) * troopsMin;
////        System.out.println("Min total attack rate - " + dynastyMinTotal);
////}
////}
