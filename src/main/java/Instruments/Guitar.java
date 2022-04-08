package Instruments;

public class Guitar extends Instrument{

    private GuitarType type;
    private int numberOfStrings;

    public Guitar(String colour, String brand, GuitarType type, int numberOfStrings) {
        super(colour, brand);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
    }
}
