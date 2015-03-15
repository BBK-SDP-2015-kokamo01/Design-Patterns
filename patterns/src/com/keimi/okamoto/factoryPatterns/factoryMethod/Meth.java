package com.keimi.okamoto.factoryPatterns.factoryMethod;

public abstract class Meth {
    protected String name;

    public void prepare() {
        System.out.println("Pouring ingredients to make " + name);
    }

    public void cook() {
        System.out.println("Goggles on. Let's cook!");
    }

    public void cut() {
        System.out.println("Cutting meth...");
    }

    public void pack() {
        System.out.println("Packaging meth!");
    }
}
