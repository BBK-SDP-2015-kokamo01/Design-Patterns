package com.keimi.okamoto.singletonPatterns;

/**
 * A Singleton class that used standard synchronization.
 * Although thread safe, synchronization is an expensive operation!
 */

public class UniqueNumberGeneratorSynchronized {

    private static UniqueNumberGeneratorSynchronized uniqueNumberGenerator = null;
    private int number = 0;

    private UniqueNumberGeneratorSynchronized() {
    }

    public static synchronized UniqueNumberGeneratorSynchronized getInstance(){
        if (uniqueNumberGenerator != null) {
            return uniqueNumberGenerator;
        }
        //Once this has been created it does not need to be checked for synchronization but
        //as the whole method is synchronised it will keep doing so, resulting in unnecessary
        //overhead.
        return uniqueNumberGenerator = new UniqueNumberGeneratorSynchronized();
    }

    public int getUniqueNumber() {
        return number += 1;
    }
}
