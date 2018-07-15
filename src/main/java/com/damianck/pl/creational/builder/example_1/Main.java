package com.damianck.pl.creational.builder.example_1;

public class Main {
    public static void main(String[] args) {

        LunchOrder lunchOrder = new LunchOrder.Builder()
                .bread("Wheat")
                .meat("ham")
                .dressing("Mayo")
                .build();

        System.out.println(lunchOrder);

    }
}
