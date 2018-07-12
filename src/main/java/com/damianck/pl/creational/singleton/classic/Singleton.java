package com.damianck.pl.creational.singleton.classic;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {
    private static volatile Singleton instance = null;

    private Singleton() {
        if (instance != null) {
            throw new AssertionError("Illegal initialization");
        }
    }

    // thread safe
    public static Singleton getIntance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // serializable safe
    protected Object readResolve() {
        return getIntance();
    }

    // clone safe
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getIntance();
    }
}
