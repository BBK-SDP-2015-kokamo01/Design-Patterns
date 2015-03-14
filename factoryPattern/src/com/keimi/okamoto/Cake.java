package com.keimi.okamoto;

public class Cake extends Product {

    /*
     * Only ever needs to happen once.
     * No one should ever have access to it.
     */
    static {
        System.out.println("should register cake");
        ProductFactory.getInstance().registerProduct("cake", new Cake());
    }

    @Override
    public Product create() {
        return new Cake();
    }
}
