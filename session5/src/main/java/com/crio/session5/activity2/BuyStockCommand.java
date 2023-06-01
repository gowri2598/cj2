package com.crio.session5.activity2;

public class BuyStockCommand implements Order {
  private StockTrade mabcStock;
  private String mstockName;
  private int mnumShares;


   public BuyStockCommand(StockTrade abcStock, String stockName, int numShares){
     mabcStock=abcStock;
     mstockName=stockName;
     mnumShares=numShares;
   }

   public void execute() {
     mabcStock.buy(mstockName, mnumShares);
   }
 }
