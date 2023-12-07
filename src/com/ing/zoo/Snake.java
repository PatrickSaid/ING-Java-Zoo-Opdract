package com.ing.zoo;

import java.util.Random;

public class Snake extends Animal {
    public String helloText;
    public String eatText;
    public String trick;

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
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "Slings on a tree branch";
        } else {
            trick = "Eats a whole goat";
        }
        return trick;
    }
}
