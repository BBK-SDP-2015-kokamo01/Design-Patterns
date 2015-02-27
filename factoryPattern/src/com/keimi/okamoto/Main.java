package com.keimi.okamoto;

public class Main {

    public static void main(String[] args) {
        //This violates the open/closed principal as the creation of the object depends
        //on the string goint into the class 'AnimalFactory'
        Animal tiger = AnimalFactory.createAnimal("Tiger");
        Tiger a = (Tiger)tiger;
        System.out.println(a.method());


        //By using reflectiong the class can be extended without having to modify the
        //other code abiding by the open/closed principal.
        ReflectionAnimalFactory reflectionAnimalFactory = new ReflectionAnimalFactory();
        Animal dog = reflectionAnimalFactory.getInstance("Dog");
        System.out.println(dog.makeNoise());
    }
}
