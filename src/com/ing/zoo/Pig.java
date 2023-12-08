package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal {

    public String helloText;
    public String eatText;
    public String trick;

    private final String[] tricks = {"rolls in the mud","runs in circles"};

    public Pig(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "splash";
    }

    public String eatLeaves() {
        return eatText = "munch munch oink";
    }

    public String eatMeat() {
        return eatText = "nomnomnom oink thx";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(tricks.length);
        return trick = tricks[rnd];
    }
}
