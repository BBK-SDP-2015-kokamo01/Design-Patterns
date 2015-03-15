package com.keimi.okamoto.anotherFactory;

public class LaserEnemyShip extends EnemyShip {

    public LaserEnemyShip() {
        setName("Laser enemy ship");
        setDamage(5.0);
    }
    @Override
    protected void sayhi() {
        System.out.println("hi I'm called " + getName());
    }
}
