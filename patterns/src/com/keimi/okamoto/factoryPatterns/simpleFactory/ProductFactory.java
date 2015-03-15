package com.keimi.okamoto.factoryPatterns.simpleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a cleaner way to implement the factory pattern.
 * Abstraction added so not to violate the open/closed principal
 * like the animal factory.
 */
public class ProductFactory {
    private static ProductFactory productFactory = new ProductFactory();
    private static Map<String, Product> map_registeredProducts = new HashMap<>();

    private ProductFactory() {}

    public static ProductFactory getInstance() {
        System.out.println("im giving you a factory yo!");
        return productFactory;
    }

    public void registerProduct(String productType, Product product){
        map_registeredProducts.put(productType, product);
    }

    public Product createProduct(String productType){
        Product x = map_registeredProducts.get(productType);
        System.out.println(x);
        return x.create();
    }
}
