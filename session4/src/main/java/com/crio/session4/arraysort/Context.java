package com.crio.session4.arraysort;

public class Context {
    private final SortStrategy strategy;
    public Context(SortStrategy strategy){
        this.strategy = strategy; 
    } 
    public void arrange(int[] input) { strategy.sort(input); } 
}
