package com.keimi.okamoto.strategyPattern.StrategyPattern;

public class Animal {

    private String name;
    private String favFood;
    private String sound;
    public Flys flyingType;


    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public String getSound() {
        return sound;
    }

	/* BAD
    * Not all animals fly!
	public void fly(){
		System.out.println("I'm flying");
	}
	*/

    /**
     * Animal pushes off the responsibility for flying to flyingType
     */
    public String tryToFly() {
        return flyingType.fly();
    }

    // If you want to be able to change the flyingType dynamically
    // add the following method

    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }

}