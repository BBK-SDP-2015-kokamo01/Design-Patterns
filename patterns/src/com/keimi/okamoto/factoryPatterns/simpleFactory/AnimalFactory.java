package com.keimi.okamoto.factoryPatterns.simpleFactory;

public class AnimalFactory {

    public static Animal createAnimal(String type) {
        //As each animal is added this method must be
        //modified, violating the open/closed principal.
        if (type == "Tiger") return new Tiger();
        if (type.equals("Dog")) return new Dog();
        return null;
    }
}
