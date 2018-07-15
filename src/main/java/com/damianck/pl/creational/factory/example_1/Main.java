package com.damianck.pl.creational.factory.example_1;

public class Main {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println("Blog pages= " + blog.getPages());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("Shop pages= " + shop.getPages());

    }
}
