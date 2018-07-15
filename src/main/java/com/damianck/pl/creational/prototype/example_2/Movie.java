package com.damianck.pl.creational.prototype.example_2;

public class Movie extends Item {

    private int duration;
    private String director;

    public Movie(long itemId, String itemTitle, ItemStatus itemStatus, int duration, String director) {
        super(itemId, itemTitle, itemStatus);
        this.duration = duration;
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "itemId=" + getItemId() +
                ", itemTitle=" + getItemTitle() +
                ", itemStatus=" + getItemStatus() +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                '}'  + "\n=> " + super.toString();
    }
}
