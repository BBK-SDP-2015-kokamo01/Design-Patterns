package com.keimi.okamoto.strategyPattern.anotherStrategyPattern;

public class OurUniverse {

    public static void main(String[] args) {
        Walter walter = new Walter();
        walter.setPetercide(new Playful());
        System.out.println(walter);

        Walter walternate = new Walter();
        walternate.setPetercide(new Murderous());
        System.out.println(walternate);

        Walter roboWalter = new Walter();
        roboWalter.setPetercide(new Emotionless());
        System.out.println(roboWalter);

    }
}
