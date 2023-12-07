package com.ing.zoo;

import java.util.Random;

public class Pig extends Animal {

    public String helloText;
    public String eatText;
    public String trick;

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
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        return trick;
    }
}
