package com.keimi.okamoto.strategyPattern.StrategyPattern;

public class Bird extends Animal {

    public Bird(Flys flyingType) {
        super(); //Doesn't need to be here. Implicit call happening! :)
        this.flyingType = flyingType;
        setSound("Tweet");
    }
}
