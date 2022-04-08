package Instruments;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private GuitarType type;
    private int numberOfStrings;

    public Guitar(String colour, String brand, double price, GuitarType type, int numberOfStrings) {
        super(colour, brand, price);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "twing twang";
    }
}
