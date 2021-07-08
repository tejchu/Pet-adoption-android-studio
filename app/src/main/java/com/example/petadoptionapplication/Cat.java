package com.example.petadoptionapplication;

public class Cat extends Animal{

    boolean isCatMean;
    int timesCatShower;

    Cat(String name, double weight, String furType, boolean doesShed, boolean isMean, int timesShower) {
        super(name, weight, furType, doesShed);
        isCatMean = isMean;
        timesCatShower = timesShower;

    }

}
