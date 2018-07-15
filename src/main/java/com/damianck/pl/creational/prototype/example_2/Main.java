package com.damianck.pl.creational.prototype.example_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Registry registry = Registry.getInstance();

        List<Item> items = new ArrayList<>();

        Movie item = (Movie) registry.createItem(ItemType.MOVIE);
        item.setDirector("Adam K. Foo");
        item.setDuration(92);
        item.setItemStatus(ItemStatus.SOLD);
        item.setItemTitle("The Story Of A Man Who Lives Silly");
        item.setItemId(1);

        items.add(item);

        item = (Movie) registry.createItem(ItemType.MOVIE);
        item.setDirector("Zac Mac Kracker");
        item.setDuration(66);
        item.setItemStatus(ItemStatus.SOLD);
        item.setItemTitle("My Teacher And Her Stupid Green Martian Lover");
        item.setItemId(2);

        items.add(item);

        Book book = (Book) registry.createItem(ItemType.BOOK);
        book.setAuthor("Michael Z. Dude");
        book.setNumberOfPages(35);
        book.setItemStatus(ItemStatus.SOLD);
        book.setItemTitle("Dudeism : The New Religion");
        book.setItemId(3);

        items.add(book);

        book = (Book) registry.createItem(ItemType.BOOK);
        book.setAuthor("Mr. Anonymous");
        book.setNumberOfPages(983);
        book.setItemStatus(ItemStatus.SOLD);
        book.setItemTitle("A Guide To Everything That You Don't Need To Know");
        book.setItemId(4);

        items.add(book);

        items.forEach(System.out::println);

    }
}
