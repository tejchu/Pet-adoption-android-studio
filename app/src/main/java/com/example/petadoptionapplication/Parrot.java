package com.example.petadoptionapplication;

public class Parrot extends Animal{

    int parrotFeatherNumber;
    boolean doesParrotTalk;

    Parrot(String name, double weight, String furType, boolean doesShed, int featherNumber, boolean doesTalk) {
        super(name, weight, furType, doesShed);
        parrotFeatherNumber = featherNumber;
        doesParrotTalk = doesTalk;
    }

}
