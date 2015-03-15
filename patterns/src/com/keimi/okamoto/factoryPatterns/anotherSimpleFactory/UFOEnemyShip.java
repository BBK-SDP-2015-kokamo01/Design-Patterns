package com.keimi.okamoto.factoryPatterns.anotherSimpleFactory;

public class UFOEnemyShip extends EnemyShip {

    public UFOEnemyShip() {
        super.setName("UFO enemy ship");
        super.setDamage(20.0);
    }

    @Override
    protected void sayhi() {
        System.out.println("hi I'm called " + super.getName());
    }
}
