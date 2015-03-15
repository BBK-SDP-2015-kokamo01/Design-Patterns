package com.keimi.okamoto.anotherFactory;

/**
 * Factory pattern ensures that classes are chosen at runtime.
 * So when you don't know ahead of time what class you need.
 * All class must be on the same hirachey so that means that they
 * will all extend fromt the same super class.
 */
public abstract class EnemyShip {

    private String name;
    private double damage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following hero.");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " and does " + getDamage() + " of damage.");
    }

    protected abstract void sayhi();
}
