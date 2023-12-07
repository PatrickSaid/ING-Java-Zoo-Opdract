package com.ing.zoo;

import java.util.Random;

public class Giraffe extends Animal{
    public String helloText;
    public String eatText;
    public String trick;

    public Giraffe(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "hummmmm";
    }

    public String eatLeaves() {
        return eatText = "the higher the leave in the tree the better, yum!";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "Sprints away";
        } else {
            trick = "Balances on a giant ball";
        }
        return trick;
    }
}
