package com.gmail.squizikbro;

public class Chenese {
    public static void main(String[] args) {

        int dynastyLiVoin = 13;
        int dynastyLiLuchnik = 24;
        int dynastyVershnyk = 46;
        int troopsLi = 860;
        int dynastyLiTotal = (dynastyLiVoin + dynastyLiLuchnik + dynastyVershnyk) * troopsLi;
        System.out.println("Li total attack rate - " + dynastyLiTotal);

        int dynastyMinVoin = 9;
        int dynastyMinLuchnik = 35;
        int dynastyMinVershnyk = 12;
        int troopsMin = (int) (troopsLi * 1.5);
        int dynastyMinTotal = (dynastyMinVoin + dynastyMinLuchnik + dynastyMinVershnyk) * troopsMin;
        System.out.println("Min total attack rate - " + dynastyMinTotal);








    }
}
