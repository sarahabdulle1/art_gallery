package org.example;

public class Customer {
    private String name;
    private double wallet;
//    CONSTRUCTOR
    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }
//    getters
    public String getName(){
        return name;
    }
    public double getWallet(){
        return wallet;
    }
//    setters

    public void setWallet(double newWallet){
        this.wallet = newWallet;
    }

    public void setName(String newName) {
        this.name = newName;
    }

//  Methods
//   private ArrayList<Artwork> stock;

//   public Artwork(String title, String artist, double price) {

    public void buyArtwork(String selectedTitle, Gallery gallery) {
//        for(int i=0; i < stock.size(); i++){
       for (Artwork artwork: gallery.getStock())    {
            if (artwork.getTitle().equals(selectedTitle)) {
                wallet -= artwork.getPrice();
                gallery.increaseTill(artwork.getPrice());
            }
        }
}

}
