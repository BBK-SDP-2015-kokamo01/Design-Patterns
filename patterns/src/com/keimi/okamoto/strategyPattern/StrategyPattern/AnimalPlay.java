package com.keimi.okamoto.strategyPattern.StrategyPattern;

// Composition allows you to change the capabilities of
// objects at run time!
public class AnimalPlay {

    public static void main(String[] args) {
        Flys flys = new ItFlys();
        Flys nonFly = new CantFly();

        Animal dog = new Dog(nonFly);
        Animal bird = new Bird(flys);
        Animal goose = new Goose(flys);

        System.out.println("Dog: " + dog.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());
        System.out.println("Goose: " + goose.tryToFly());


        // This allows dynamic changes for flyingType

        dog.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + dog.tryToFly());

    }

}