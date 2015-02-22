package com.keimi.okamoto;

/**
 * A Singleton class that used standard synchronization.
 * Although thread safe, synchronization is an expensive operation!
 */

public class UniqueNumberGeneratorSynchronized {

    private static UniqueNumberGeneratorSynchronized uniqueNumberGenerator = null;
    private static int number = 0;

    private UniqueNumberGeneratorSynchronized() {
    }

    public static synchronized UniqueNumberGeneratorSynchronized getInstance(){
        if (uniqueNumberGenerator != null) {
            return uniqueNumberGenerator;
        }
        //Once this has been created it does not need to be checked for synchronization but
        //as the whole method is synchronised it will keep doing so, resulting in unnecessary
        //overhead.
        return new UniqueNumberGeneratorSynchronized();
    }

    public int getUniqueNumber() {
        return number += 1;
    }
}
