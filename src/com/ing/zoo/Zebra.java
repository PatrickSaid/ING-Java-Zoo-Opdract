package com.ing.zoo;

import java.util.Random;

public class Zebra extends Animal {

    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "zebra zebra";
    }

    public String eatLeaves() {
        return eatText = "munch munch zank yee bra";
    }
}
