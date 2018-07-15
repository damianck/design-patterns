package com.damianck.pl.creational.factory.example_1;

import com.damianck.pl.creational.factory.example_1.pages.CartPage;
import com.damianck.pl.creational.factory.example_1.pages.ItemPage;
import com.damianck.pl.creational.factory.example_1.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
