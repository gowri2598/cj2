package com.crio.session4.activity3.strategywithfactory;

public class InterestStrategyFactory {

    public static InterestCalculationStrategy createStrategy(String strategyType) {
        InterestCalculationStrategy strategy = null;
              if (strategyType != null) {
                  if ("COMPOUND".equalsIgnoreCase(strategyType)) {
                  strategy = new CompoundInterest();
                  } else if ("SIMPLE".equalsIgnoreCase(strategyType)) {
                  strategy = new SimpleInterest();
                  } else {
                  System.err.println("Unknown/unsupported strategy-type");
                  }
              }
              return strategy;
        }
    
}
