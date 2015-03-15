package com.keimi.okamoto.anotherFactory;

public class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip() {
        super.setName("Rocket enemy ship");
        super.setDamage(10.0);
    }

    @Override
    protected void sayhi() {
        System.out.println("hi i'm called " + super.getName());
    }
}
