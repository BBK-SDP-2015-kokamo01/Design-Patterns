package com.keimi.okamoto;

public class AnimalFactory {

    public static Animal createAnimal(String type) {
        if (type == "Tiger") return new Tiger();
        if (type.equals("Dog")) return new Dog();
        return null;
    }
}
