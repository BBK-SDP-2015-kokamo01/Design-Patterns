package com.keimi.okamoto.strategyPattern.anotherStrategyPattern;

public class Walter {

    private Behaviour behaviour;

    public void setPetercide(Behaviour behaviour) {
        this.behaviour = behaviour;
    }


    @Override
    public String toString() {
        if (behaviour.killPeter() == null) {
            return "I don't care";
        } else if (behaviour.killPeter()) {
            return "Must use Peter to destroy the world";
        } else {
            return "Lets take drugs";
        }
    }
}
