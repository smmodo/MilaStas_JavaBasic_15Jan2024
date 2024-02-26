package com.gmail.squizikbro;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loop For:");
        for (int a = 1; a <= 95; a += 3)
            System.out.print(" " + a);

        String space2 = "";
        System.out.println(space2);

        System.out.println("Loop While:");
        int b = 1;
        while (b <= 95 || b == 95) {
            b += 3;
            System.out.print(" " + b);
        }

        String space3 = "";
        System.out.println(space3);

        System.out.println("Loop Do while");
        int c = 1;
        do {
            System.out.print(" " + c);
            c += 3;
        } while (c <= 95);
    }
}
