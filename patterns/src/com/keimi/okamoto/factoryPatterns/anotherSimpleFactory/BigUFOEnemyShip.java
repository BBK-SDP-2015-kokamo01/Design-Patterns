package com.keimi.okamoto.factoryPatterns.anotherSimpleFactory;

public class BigUFOEnemyShip extends UFOEnemyShip {

    public BigUFOEnemyShip() {
        super.setName("Big UFO enemy ship");
        super.setDamage(40.0);
    }

    protected void sayhi() {
        super.sayhi();
    }
}

