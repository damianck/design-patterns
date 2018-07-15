package com.damianck.pl.creational.prototype.example_2;

public abstract class Item implements Cloneable {

    private long itemId;
    private String itemTitle;
    private ItemStatus itemStatus;

    public Item(long itemId, String itemTitle, ItemStatus itemStatus) {
        this.itemId = itemId;
        this.itemTitle = itemTitle;
        this.itemStatus = itemStatus;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

}
