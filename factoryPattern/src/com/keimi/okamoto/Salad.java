package com.keimi.okamoto;

public class Salad extends Product {
    static {
        ProductFactory.getInstance().registerProduct("Salad", new Salad());
    }

    private String[] ingredients;

    @Override
    public Product create() {
        return new Salad();
    }

    public void addIngredients(String... ingredients) {
        this.ingredients = ingredients;
    }

    public boolean toss() {
        return true;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
