package Shop;

import Behaviours.ISell;
import Instruments.Guitar;
import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock() {
    }
}
