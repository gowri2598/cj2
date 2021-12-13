package com.crio.session4.activity2;

public class TaxComputation {

    double calculateTax(Item item) {
        if(item.getItemCode() == 0) {
            System.out.println("Required Tax = 12% Plus surcharge");
        }
        if(item.getItemCode() == 1) {
            System.out.println("Required Tax = 18% Plus surcharge");
        }
        if(item.getItemCode() == 2) {
            System.out.println("Required Tax = 6% Plus surcharge");
        }
        return 0.0;
    }


}

class Item {
    int itemCode; // 0 = restaurant, 1 = electronics, 2 = Automobile
    public int getItemCode() {
        return itemCode;
    }
}
