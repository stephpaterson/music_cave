import Instruments.Guitar;
import Instruments.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("blue", "Fender", GuitarType.BASS,4);
    }

    @Test
    public void canPlay(){
        assertEquals("twing twang", guitar.play());
    }
}
