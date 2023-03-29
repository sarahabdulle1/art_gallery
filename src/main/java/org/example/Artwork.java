package org.example;

import java.io.CharArrayWriter;
import java.util.ArrayList;

public class Artwork {
    private String title;
    private String artist;
    private double price;


//    CONSTRUCTOR
    public Artwork(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }
    // Setters

//    public void setTitle(String newTitle){
//        this.title = newTitle;
//    }


//    public void setPrice(double newPrice){
//        this.price = newPrice;
//    }





}
