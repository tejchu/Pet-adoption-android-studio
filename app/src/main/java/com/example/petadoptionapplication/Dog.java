package com.example.petadoptionapplication;

public class Dog extends Animal{


    boolean doesDogBark;
    String dogBarkType;

    Dog(String name, double weight, String furType, boolean doesShed, boolean doesBark, String barkType) {
        super(name, weight, furType, doesShed);
        doesDogBark = doesBark;
        dogBarkType = barkType;
    }
}
