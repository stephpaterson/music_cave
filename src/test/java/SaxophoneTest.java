import Instruments.Saxophone;
import Instruments.SaxophoneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("gold", "yamaha", 400 ,SaxophoneType.ALTO);
    }

    @Test
    public void canPlay(){
        assertEquals("do do do dodododooooo", saxophone.play());
    }
}
