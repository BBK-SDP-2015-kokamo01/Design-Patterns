package com.keimi.okamoto.singletonPatterns;

/**
 * No synchronization necessary as the class is instantiated when the class is loaded.
 */
public class UniqueNumberGeneratorEagerInstantiation {

    private static UniqueNumberGeneratorEagerInstantiation uniqueNumberGeneratorEagerInstantiation = new UniqueNumberGeneratorEagerInstantiation();
    private static int number;

    private UniqueNumberGeneratorEagerInstantiation() {
    }

    public static UniqueNumberGeneratorEagerInstantiation getInstance() {
        return uniqueNumberGeneratorEagerInstantiation;
    }

    public int getNumber() {
        return number += 1;
    }
}
