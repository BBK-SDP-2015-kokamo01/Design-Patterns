package com.keimi.okamoto.factory;

public class Main {

    public static void main(String[] args) {
        //This violates the open/closed principal as the creation of the object depends
        //on the string going into the class 'AnimalFactory'
        Animal tiger = AnimalFactory.createAnimal("Tiger");
        Tiger a = (Tiger) tiger;
        System.out.println(a.method());


        //By using reflectiong the class can be extended without having to modify the
        //other code abiding by the open/closed principal.
        ReflectionAnimalFactory reflectionAnimalFactory = new ReflectionAnimalFactory();
        Animal dog = reflectionAnimalFactory.getInstance("Dog");
        System.out.println(dog.makeNoise());

        //This doesb't violates the open/closed principal.
        //As of now the Products aren't being called quick enough
        //there is a null pointer exception.
        ProductFactory productFactory = ProductFactory.getInstance();
        Cake cake = (Cake) productFactory.createProduct("cake");
        Salad salad = (Salad) productFactory.createProduct("Salad");
        salad.addIngredients("Lettuce", "Tomato", "Chicken", "Croutons");
        System.out.println(salad.toss());
    }
}
