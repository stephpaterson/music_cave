import Behaviours.ISell;
import Instruments.Guitar;
import Instruments.GuitarType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("purple", "Gibson", 600, 450, GuitarType.ELECTRIC, 6);
        stock = new ArrayList<>();
        stock.add(guitar);
        shop = new Shop(stock);
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(2, shop.getStockCount());
    }

//    @Test
//    public void canRemoveStock(){
//        shop.removeStock();
//        assertEquals(0, shop.getStockCount());
//    }
}
