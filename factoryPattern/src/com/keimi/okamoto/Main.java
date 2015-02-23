package com.keimi.okamoto;

public class Main {

    public static void main(String[] args) {

        Animal dog = AnimalFactory.createAnimal("Tiger");
        System.out.println(dog.makeNoise());
    }
}
