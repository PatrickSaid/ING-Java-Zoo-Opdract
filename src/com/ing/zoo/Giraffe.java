package com.ing.zoo;

import java.util.Random;

public class Giraffe extends Animal{

    public String helloText;
    public String eatText;
    public String trick;

    private String[] tricks = {"Sprints away","Balances on a giant ball"};

    public Giraffe(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "hummmmm";
    }

    public String eatLeaves() {
        return eatText = "the higher the leave is in the tree the better, yum!";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(tricks.length);
        return trick = tricks[rnd];
    }
}
