package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Gav");
        animals[1] = new Cat("Mars");

        boolean compare = compare(animals);
    }

    public static boolean compare(Animal[] animals) {

        System.out.println(Arrays.toString(animals));

        return (animals[1].equals(animals[0]));
    }
}
