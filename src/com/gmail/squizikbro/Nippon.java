package com.gmail.squizikbro;

public class Nippon {
    public static void main(String[] args) {

        int shuttle = 1;
        while (shuttle < 100) {
            shuttle++;

            if (shuttle % 10 != 4 && shuttle % 10 != 9 && shuttle / 10 != 4 && shuttle / 10 != 9) {
                System.out.println(shuttle);
            }

        }
    }
}
