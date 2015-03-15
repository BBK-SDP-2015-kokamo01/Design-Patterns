package com.keimi.okamoto.factoryPatterns.factoryMethod;

public abstract class BreakingBadMethStore {

    //As the this method is defined in an abstract meth store
    //and not the sub classes, so the method has no idea which subclass is
    //running the code and ordering meth!
    public final Meth orderMeth(String type) {
        Meth meth;

        meth = createMeth(type);

        meth.prepare();
        meth.cook();
        meth.cut();
        meth.pack();

        return meth;
    }

    /**
     * Responsibility of instantiating meth has been delegated
     * into a method that acts as a factory.
     *
     * abstract so subclasses must handle object creation.
     */
    protected abstract Meth createMeth(String type);
}
