package com.keimi.okamoto.factoryPatterns.factoryMethod;

public class WalterWhitesMethStore extends BreakingBadMethStore {
    @Override
    protected Meth createMeth(String type) {
        if (type.equals("Blue Sky")) {
            return new WaltsBlueSky();
        } else if (type.equals("Jesses Meth")){
            return new JessesMeth();
        }
        return null;
    }


}
