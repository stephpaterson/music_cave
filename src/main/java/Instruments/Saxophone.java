package Instruments;

public class Saxophone extends Instrument implements IPlay{

    private SaxophoneType type;

    public Saxophone(String colour, String brand, SaxophoneType type) {
        super(colour, brand);
        this.type = type;
    }

    @Override
    public String play() {
        return "do do do dodododooooo";
    }
}
