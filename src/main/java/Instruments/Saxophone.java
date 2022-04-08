package Instruments;

public class Saxophone extends Instrument{

    private SaxophoneType type;

    public Saxophone(String colour, String brand, SaxophoneType type) {
        super(colour, brand);
        this.type = type;
    }
}
