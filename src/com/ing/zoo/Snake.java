package com.ing.zoo;

import java.util.Random;

public class Snake extends Animal {
    public String helloText;
    public String eatText;
    public String trick;

    private String[] tricks = {"Slings on a tree branch","Eats a whole goat"};

    public Snake(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "Hisssss";
    }

    public String eatMeat() {
        return eatText = "Tassssty thank youussss";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(tricks.length);
        return trick = tricks[rnd];
    }
}
