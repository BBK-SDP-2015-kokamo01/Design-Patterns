package com.keimi.okamoto.factoryPatterns.factoryMethod;

public class WaltsBlueSky extends Meth {

    public WaltsBlueSky() {
        name = "Walt's Blue Sky.";
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("It better be blue!");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("It's blue!");
    }
}
