package com.keimi.okamoto.strategyPattern.StrategyPattern;

public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog(Flys flyingType) {
        super(); //Doesn't need to be here. Implicit call happening! :)
        this.flyingType = flyingType;
        setSound("Bark");
    }

	/* BAD
    * As this is redundant and we will have to make
	* all not flying animals implement this.
	*
	public void fly(){
	    System.out.println("I can't fly");
	}
	*/

}
