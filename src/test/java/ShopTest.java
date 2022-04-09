import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.Saxophone;
import Instruments.SaxophoneType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar;
    Saxophone saxophone;

    @Before
    public void before(){
        guitar = new Guitar("purple", "Gibson", 600, 450, GuitarType.ELECTRIC, 6);
        saxophone = new Saxophone("gold", "sax", 500, 300, SaxophoneType.ALTO);
        stock = new ArrayList<>();
        stock.add(guitar);

        shop = new Shop(stock);
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.removeStock(guitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalProfit(){
        stock.add(saxophone);
        assertEquals(350, shop.totalProfit(), 0.1);
    }
}
