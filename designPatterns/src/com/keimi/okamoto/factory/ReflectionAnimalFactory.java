package com.keimi.okamoto.factory;

import com.keimi.okamoto.factory.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAnimalFactory {

    public Animal getInstance(String type){

        Class<?> animal = null;
        try {
            animal = Class.forName(this.getClass().getPackage().getName() + "." + type);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Constructor<?>[] allConstructors = animal.getConstructors();
        Constructor constructor = allConstructors[0];

        try {
            return (Animal) constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
