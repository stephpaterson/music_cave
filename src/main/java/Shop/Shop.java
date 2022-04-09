package Shop;

import Behaviours.ISell;

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

    public void removeStock(ISell item) {
        stock.remove(item);
    }

    public double totalProfit() {
        double totalProfit = 0;
        for(ISell item : this.stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
