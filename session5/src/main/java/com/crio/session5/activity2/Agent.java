package com.crio.session5.activity2;

import java.util.ArrayList;
import java.util.List;

   public class Agent {

   List<Order> orders=new ArrayList<>();

   public void placeOrder(Order order){
      orders.add(order);

   }

   public void processOrders(){
      for(Order o:orders){
         o.execute();
      }
    
   }
}
