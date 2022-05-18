package com.crio.session5.activity2;

public class Main {
    public static void main(String[] args) {
        StockTrade abcStock = new StockTrade();
  
        BuyStockCommand buyStockOrder = new BuyStockCommand(abcStock, "OLECTRA", 20);
        SellStockCommand sellStockOrder = new SellStockCommand(abcStock,"OLECTRA", 20);
  
        Agent broker = new Agent();
        broker.placeOrder(buyStockOrder);
        broker.placeOrder(sellStockOrder);
  
        broker.processOrders();
     }
}
