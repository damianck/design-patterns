package com.damianck.pl.creational.prototype.example_2;

import java.util.EnumMap;
import java.util.Map;

public final class Registry {

    private static Registry instance = null;
    private final Map<ItemType, Item> objectMap;

    private Registry() {
        objectMap = new EnumMap<>(ItemType.class);
        loadItemPrototypes();
    }

    public static Registry getInstance() {
        if (instance == null) {
            synchronized (Registry.class) {
                if (instance == null) {
                    instance = new Registry();
                }
            }
        }
        return instance;
    }

    private void loadItemPrototypes() {
        Movie movie = new Movie(1, "Default Movie", ItemStatus.AVAILABLE, 86, "John Doe");
        objectMap.put(ItemType.MOVIE, movie);

        Book book = new Book(1, "Default Book", ItemStatus.AVAILABLE, 342, "J. Random Hacker");
        objectMap.put(ItemType.BOOK, book);
    }

    public Item createItem(ItemType type) {
        Item item = null;

        try {
            item = (Item) (objectMap.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

}
