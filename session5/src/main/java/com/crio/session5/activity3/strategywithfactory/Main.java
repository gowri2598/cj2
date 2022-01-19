package com.crio.session5.activity3.strategywithfactory;

public class Main {
    public static void main(String[] args) {
        
        Account acct1 = new Account(12345678l, "Vijay Kumar", AccountType.CURRENT);
        acct1.setInterestStrategy(InterestStrategyFactory.createStrategy("COMPOUND"));
        acct1.deposit(10000.0d);

        System.out.print(acct1);
        System.out.println(" has interest : " + acct1.getInterest(5));


        Account acct2 = new Account(12345680l, "Jay Kumar", AccountType.SAVING);
        acct2.setInterestStrategy(InterestStrategyFactory.createStrategy("SIMPLE"));
        acct2.deposit(10000.0d);

        System.out.print(acct2);
        System.out.println(" has interest : " + acct2.getInterest(5));
    }
}
