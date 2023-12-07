package com.ing.zoo;

public class Hippo extends Animal {

    public String helloText;
    public String eatText;

    public Hippo(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "splash";
    }

    public String eatLeaves() {
        return eatText = "munch munch lovely";
    }
}
