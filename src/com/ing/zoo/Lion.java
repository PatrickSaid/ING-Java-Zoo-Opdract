package com.ing.zoo;

public class Lion extends Animal {

    public String helloText;
    public String eatText;

    public Lion(String name) {
        super(name);
    }

    public String sayHello() {
        return helloText = "roooaoaaaaar";
    }

    public String eatMeat() {
        return eatText = "nomnomnom thx mate";
    }
}
