package com.keimi.okamoto.strategyPattern;

// Composition allows you to change the capabilities of
// objects at run time!
public class AnimalPlay {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal bird = new Bird();
        Animal goose = new Goose();

        System.out.println("Dog: " + dog.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());
        System.out.println("Goose: " + goose.tryToFly());


        // This allows dynamic changes for flyingType

        dog.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + dog.tryToFly());

    }

}