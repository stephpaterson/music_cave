package Instruments;

import Behaviours.ISell;

public class Reed implements ISell {

    private String material;
    private double sellPrice;
    private double buyPrice;

    public Reed(String material, double sellPrice, double buyPrice) {
        this.material = material;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    @Override
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
