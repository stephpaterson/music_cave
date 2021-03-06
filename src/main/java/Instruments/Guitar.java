package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay {

    private GuitarType type;
    private int numberOfStrings;

    public Guitar(String colour, String brand, double sellPrice, double buyPrice, GuitarType type, int numberOfStrings) {
        super(colour, brand, sellPrice, buyPrice);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "twing twang";
    }

}
