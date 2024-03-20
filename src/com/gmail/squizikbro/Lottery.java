package com.gmail.squizikbro;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int[] organizerTicket = generate();
        int[] userTicket = generate();

        System.out.println("Organizer's Ticket: " + Arrays.toString(organizerTicket));
        System.out.println("User ticket: " + Arrays.toString(userTicket));
        System.out.println("");

        Arrays.sort(organizerTicket);
        Arrays.sort(userTicket);
        System.out.println("Organizer's sorted ticket: " + Arrays.toString(organizerTicket));
        System.out.println("User sorted ticket: " + Arrays.toString(userTicket));
        System.out.println("");

        System.out.println("Coincidence: " + calculateResult(organizerTicket, userTicket));
    }

    public static int[] generate() {
        int[] ticket = new int[7];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = ThreadLocalRandom.current().nextInt(10);
        }
        return ticket;
    }

    public static int calculateResult(int[] ticket, int[] userTicket) {
        int result = 0;
        for (int i = 0; i < Math.min(ticket.length, userTicket.length); i++) {
            if (ticket[i] == userTicket[i]) {
                result++;
            }
        }

        return result;
    }
}
