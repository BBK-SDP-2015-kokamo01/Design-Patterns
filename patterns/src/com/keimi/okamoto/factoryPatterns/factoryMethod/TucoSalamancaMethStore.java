package com.keimi.okamoto.factoryPatterns.factoryMethod;

public class TucoSalamancaMethStore extends BreakingBadMethStore {

    @Override
    protected Meth createMeth(String type) {
        if (type.equals("Risin")) {
            return new RicinMeth();
        } else if (type.equals("Tuco")){
            return new TucosSpecialMeth();
        }
        return null;
    }
}
