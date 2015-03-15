package com.keimi.okamoto.factory;

/**
 * IMPORTANT! Please ensure that extending classes
 * all register with the factory in a static initialisation
 * block.
 */
public abstract class Product {

    public abstract Product create();
}
