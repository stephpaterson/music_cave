package Instruments;

public class GuitarString {

    private String stringMaterial;
    private String gauge;
    private String core;
    private String windingType;
    private String coating;
    private double price;

    public GuitarString(String stringMaterial, String gauge, String core, String windingType, String coating, double price) {
        this.stringMaterial = stringMaterial;
        this.gauge = gauge;
        this.core = core;
        this.windingType = windingType;
        this.coating = coating;
        this.price = price;
    }
}
