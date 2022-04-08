package Instruments;

import Behaviours.ISell;

public class Instrument implements ISell {

    private String colour;
    private String brand;
    private double sellPrice;
    private double buyPrice;


    public Instrument(String colour, String brand, double sellPrice, double buyPrice ) {
        this.colour = colour;
        this.brand = brand;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
