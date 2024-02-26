package com.gmail.squizikbro;

public class Nippon {
    public static void main(String[] args) {

        //У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
        // щоб у номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
        // яка виводить усі номери таких шатлів.

//        int shuttle = 1;
//        while (shuttle < 100) {
//            shuttle++;
//
//            if (shuttle % 10 != 4 && shuttle % 10 != 9 && shuttle / 10 != 4 && shuttle / 10 != 9) {
//                System.out.println(shuttle);
//            }
//
//
//
//        }
//    }
//}
        int shuttle = 0;
        int inprogress = 0;

        while (shuttle < 999999) {
            shuttle++;
            for (int i = 1; i < shuttles.length; i++);
                inprogress = shuttle;
                if (inprogress % 10 != 4 && inprogress % 10 != 9) {
                    System.out.println(shuttle);
                }
            inprogress=inprogress/10;
        }
    }
}
