package com.keimi.okamoto.anotherFactory;

public class EnemyShipFactory {

    private static EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

    private EnemyShipFactory(){}

    public static EnemyShipFactory getInstance() {
        return enemyShipFactory;
    }

    public EnemyShip makeEnemyShip(String type) {

        if (type.equals("U")) {
            return new UFOEnemyShip();
        } else if (type.equals("R")) {
            return new RocketEnemyShip();
        } else if (type.equals("B")) {
            return new BigUFOEnemyShip();
        } else if (type.equals("L")) {
            return new LaserEnemyShip();
        }
        return null;
    }
}
