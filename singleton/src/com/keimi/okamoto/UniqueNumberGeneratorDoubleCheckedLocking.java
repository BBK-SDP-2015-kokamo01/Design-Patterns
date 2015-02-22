package com.keimi.okamoto;
/**
 * A Singleton class that uses double locking mechanism,
 * optimization from synchronized method block.
 */
public class UniqueNumberGeneratorDoubleCheckedLocking {

    private static UniqueNumberGeneratorDoubleCheckedLocking uniqueNumberGeneratorDoubleCheckedLocking = null;
    private static int number;

    private UniqueNumberGeneratorDoubleCheckedLocking() {
    }

    public static UniqueNumberGeneratorDoubleCheckedLocking getInstance() {
        if (uniqueNumberGeneratorDoubleCheckedLocking != null) {
            return uniqueNumberGeneratorDoubleCheckedLocking;
        }

        //Double locking as this is the only part we care that is synchronized, reduced overhead!
        //If the object is already created we do not need to use synchronized.
        //Lazy instantiation, obj is only created when it's needed!
        synchronized (UniqueNumberGeneratorDoubleCheckedLocking.class) {
            return uniqueNumberGeneratorDoubleCheckedLocking = new UniqueNumberGeneratorDoubleCheckedLocking();
        }
    }

    public static int getUniqueNumber() {
        return number += 1;
    }
}
