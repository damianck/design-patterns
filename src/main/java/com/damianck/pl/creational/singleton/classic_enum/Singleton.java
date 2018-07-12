package com.damianck.pl.creational.singleton.classic_enum;

// The best way to create singleton
// 100% guaranteed that only one instance
// !important when serializing an enum field variables are not getting serialized!
//  EXAMPLE -> if we have int value we will lose the value of the int value
// enums do not support lazy loading.
public enum Singleton {
    INSTANCE;

//    private int value;
//
//    public int getValue() {
//        return value;
//    }
//    public void setValue(int value) {
//        this.value = value;
//    }

}
