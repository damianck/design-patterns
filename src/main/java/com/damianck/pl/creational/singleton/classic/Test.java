package com.damianck.pl.creational.singleton.classic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getIntance();
        System.out.println(singleton);

        try {
            Constructor<Singleton> singletonClass = (Constructor<Singleton>) Singleton.class.getDeclaredConstructors()[0];
            singletonClass.setAccessible(true);
            Singleton singleton2 = singletonClass.newInstance(null);
            singletonClass.setAccessible(false);
            System.out.println(singleton2);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
