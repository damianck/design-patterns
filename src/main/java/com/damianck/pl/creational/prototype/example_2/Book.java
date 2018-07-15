package com.damianck.pl.creational.prototype.example_2;

public class Book extends Item {

    private int numberOfPages;
    private String author;

    public Book(long itemId, String itemTitle, ItemStatus itemStatus, int numberOfPages, String author) {
        super(itemId, itemTitle, itemStatus);
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "itemId=" + getItemId() +
                ", itemTitle=" + getItemTitle() +
                ", itemStatus=" + getItemStatus() +
                "numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                '}' + "\n => " + super.toString();
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
