package Instruments;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private SaxophoneType type;

    public Saxophone(String colour, String brand, double price, SaxophoneType type) {
        super(colour, brand, price);
        this.type = type;
    }

    @Override
    public String play() {
        return "do do do dodododooooo";
    }
}
