package com.ing.zoo;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Objects;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Boolean commandFound = false;

        //Commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //Animals
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Giraffe longboi = new Giraffe("longboi");
        Snake snek = new Snake("snek");

        Animal[] animals = {henk, elsa, dora, wally, marty, longboi, snek};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        //Loops through the commands that have been set to check if the command given in the input exists
        for (String command : commands) {
            //if the given command exists set commandFound to true and exit the for loop
            if (input.equals(command)) {
                commandFound = true;
                break;
            }
            //loops through the array of animals
            for (Animal animal : animals) {
                //if the given command equals hello and name of an existing animal println the name and its response
                if (input.equals(command + " " + animal.getName())) {
                    System.out.println(animal.getName() + " says: " + animal.sayHello());
                    commandFound = true;
                    break;
                }
            }
        }

        //if an existing command has not been found println Unknown command
        if (!commandFound) {
            System.out.println("Unknown command: " + input);
        } else {
            //loops through all the existing animals in the animals array
            for (Animal animal : animals) {
                //if command equals "hello" printline all animals saying hello
                if (input.equals(commands[0])) {
                    System.out.println(animal.getName() + " says: " + animal.sayHello());
                }
                //if command equals "give leaves" printline the eatText for all Herbivores
                else if (input.equals(commands[1])) {
                    //checks if animal.eatLeaves doesn't return an empty string
                    if (!animal.eatLeaves().isEmpty()) {
                        System.out.println(animal.getName() + " says: " + animal.eatLeaves());
                    }
                }
                //if command equals "give meat" printline the eatText for all carnivores
                else if (input.equals(commands[2])) {
                    //checks if animal.eatMeat doesn't return an empty string
                    if (!animal.eatMeat().isEmpty()) {
                        System.out.println(animal.getName() + " says: " + animal.eatMeat());
                    }
                }
                //if command equals "perform trick" printline the trick for the animals that can do tricks
                else if (input.equals(commands[3])) {
                    //checks if animal.performTrick doesn't return an empty string
                    if (!animal.performTrick().isEmpty()) {
                        System.out.println(animal.getName() + " does a trick: " + animal.performTrick());
                    }
                }
            }
        }
    }
}
