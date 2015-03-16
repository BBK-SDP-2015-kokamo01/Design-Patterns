package com.keimi.okamoto.strategyPattern.StrategyPattern;

public class Goose extends Bird {

    public Goose(Flys flyingType) {
        super(flyingType);
        setSound("Goose");
    }
}
