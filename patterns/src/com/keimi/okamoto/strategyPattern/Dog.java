package com.keimi.okamoto.strategyPattern;

public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        super();
        setSound("Bark");
        flyingType = new CantFly();

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
