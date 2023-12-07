package com.ing.zoo;

import java.util.Random;

public class Tiger extends Animal {

    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "rraaarww";
    }

    public String eatMeat() {
        return eatText = "nomnomnom oink wubalubadubdub";
    }

    public String performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        return trick;
    }
}
