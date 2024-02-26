package com.gmail.squizikbro;

public class ParallelepipedDetails {
    public static void main(String[] args) {

        int height = 8;
        int width = 5;
        int depth = 4;

        int volume = height * width * depth;
        System.out.println("Parallelepiped volume = " + volume);

        int sumLenght = 4 * (height + width + depth);
        System.out.println("Summary Lenght = " + sumLenght);

    }
}
