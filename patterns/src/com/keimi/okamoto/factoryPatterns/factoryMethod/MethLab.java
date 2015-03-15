package com.keimi.okamoto.factoryPatterns.factoryMethod;

public class MethLab {

    public static void main(String[] args) {

        BreakingBadMethStore waltsmethStore = new WalterWhitesMethStore();
        BreakingBadMethStore tucosMethStore = new TucoSalamancaMethStore();

        waltsmethStore.orderMeth("Blue Sky");
    }

}
