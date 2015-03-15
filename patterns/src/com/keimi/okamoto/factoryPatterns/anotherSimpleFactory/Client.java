package com.keimi.okamoto.factoryPatterns.anotherSimpleFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter either U/R/B/L.");

        EnemyShip enemyShip = null;

        if (userInput.hasNext()) {
            String type = userInput.nextLine();
            enemyShip = EnemyShipFactory.getInstance().makeEnemyShip(type);
        }

        if (enemyShip == null) System.out.println("Not a valid input");
        else doStuffEnemy(enemyShip);

    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
        anEnemyShip.sayhi();
    }
}
