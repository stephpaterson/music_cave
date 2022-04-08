package Instruments;

import Behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private SaxophoneType type;

    public Saxophone(String colour, String brand, double sellPrice, double buyPrice, SaxophoneType type) {
        super(colour, brand, sellPrice, buyPrice);
        this.type = type;
    }

    @Override
    public String play() {
        return "do do do dodododooooo";
    }
}
