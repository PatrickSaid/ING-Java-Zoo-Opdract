package com.ing.zoo;

//Parent class
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String eatMeat() { return ""; }

    public String eatLeaves() { return ""; }

    public String performTrick() { return ""; }

    public String getName() { return name; }

    public String sayHello() { return getName() + " is asleep right now! shhh"; }
}
