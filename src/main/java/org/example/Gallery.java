package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock;
//CONSTRUCTOR
    public Gallery(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }
//getters
    public String getName(){
        return this.name;
    }
    public double getTill(){
        return this.till;
    }
    public void increaseTill(double amount){
        this.till += amount;
    }
    public ArrayList<Artwork> getStock(){
        return this.stock;
    }
//    setters
    public void setName(String newName){
        this.name = newName;
    }

// Methods
    public void addArtwork(Artwork newArtwork) {
        this.stock.add(newArtwork);
    }

}
