package com.keimi.okamoto.singletonPatterns;

public class Main {

    public static void main(String[] args) {
        //Synchronization
	    UniqueNumberGeneratorSynchronized uniqueNumberGenerator1 = UniqueNumberGeneratorSynchronized.getInstance();

        System.out.println(uniqueNumberGenerator1.getUniqueNumber());
        System.out.println(uniqueNumberGenerator1.getUniqueNumber());

        UniqueNumberGeneratorSynchronized uniqueNumberGenerator2 = UniqueNumberGeneratorSynchronized.getInstance();

        System.out.println(uniqueNumberGenerator2.getUniqueNumber());
        System.out.println(uniqueNumberGenerator2.getUniqueNumber());


        //Double checked locking
        UniqueNumberGeneratorDoubleCheckedLocking a1 = UniqueNumberGeneratorDoubleCheckedLocking.getInstance();
        UniqueNumberGeneratorDoubleCheckedLocking a2 =UniqueNumberGeneratorDoubleCheckedLocking.getInstance();

        System.out.println(a1.getUniqueNumber());
        System.out.println(a2.getUniqueNumber());

        //Eager instantiation
        UniqueNumberGeneratorEagerInstantiation b1 = UniqueNumberGeneratorEagerInstantiation.getInstance();
        UniqueNumberGeneratorEagerInstantiation b2 = UniqueNumberGeneratorEagerInstantiation.getInstance();

        System.out.println(b1.getNumber());
        System.out.println(b2.getNumber());

    }
}
