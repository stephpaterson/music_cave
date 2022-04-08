package Instruments;

import Behaviours.ISell;

public class GuitarString implements ISell {

    private String stringMaterial;
    private String gauge;
    private String core;
    private String windingType;
    private String coating;
    private double sellPrice;
    private double buyPrice;

    public GuitarString(String stringMaterial, String gauge, String core, String windingType, String coating, double sellPrice, double buyPrice) {
        this.stringMaterial = stringMaterial;
        this.gauge = gauge;
        this.core = core;
        this.windingType = windingType;
        this.coating = coating;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
