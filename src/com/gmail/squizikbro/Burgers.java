package com.gmail.squizikbro;

public class Burgers {
    private String name;
    private String bun;
    private String meat;
    private String cheese;
    private String greenery;
    private String mayo;
    private String doubleMeat;

    public Burgers(String bun, String meat, String cheese, String greenery, String mayo) {
        this.name = "Standard burger";
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        showIngredients();
    }

    public Burgers(String bun, String meat, String cheese, String greenery) {
        this.name = "Diet burger";
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        showIngredients();

    }

    public Burgers(String bun, String meat, String cheese, String greenery, String mayo, String doubleMeat) {
        this.name = "Double meat";
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        this.doubleMeat = doubleMeat;
        showIngredients();
    }

    private void showIngredients() {
        System.out.println(name);
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Greenery: " + greenery);
        if (mayo != null) {
            System.out.println("Mayonnaise: " + mayo);
        }
        System.out.println("Double meat: " + doubleMeat);
    }
}

class BurgerMain {
    public static void main(String[] args) {
        new Burgers("bun", "beef", "gauda", "salad, onion", "mayonnaise");
        System.out.println("");
        new Burgers("whole wheat bun", "turkey", "low-fat", "salad, cucumber");
        System.out.println("");
        new Burgers("bun", "beef", "cheddar", "salad", "mayonnaise", "pork");
    }
}