package com.ing.zoo;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Objects;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];

        Boolean animalFound = false;
        Boolean commandFound = false;

        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");

        Animal[] animals = {henk, elsa, dora, wally, marty};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        for (String command : commands) {
            if (input.equals(command)) {
                commandFound = true;
                break;
            } else if (input.equals(command + " " + henk.getName())) {
                System.out.println(henk.getName() + " says: " + henk.sayHello());
                commandFound = true;
            }
        }

        if (!commandFound) {
            System.out.println("Unknown command: " + input);
        } else {
            for (Animal animal : animals) {

                if (input.equals(commands[0])) {
                    System.out.println(animal.getName() + " says: " + animal.sayHello());

                } else if (input.equals(commands[1])) {
                    if (animal.eatLeaves() != "") {
                        System.out.println(animal.getName() + " says: " + animal.eatLeaves());
                    }
                } else if (input.equals(commands[2])) {
                    if (animal.eatMeat() != "") {
                        System.out.println(animal.getName() + " says: " + animal.eatMeat());
                    }
                } else if (input.equals(commands[3])) {
                    if (animal.performTrick() != "") {
                        System.out.println(animal.getName() + " does a trick: " + animal.performTrick());
                    }
                }
            }
        }
    }
}
