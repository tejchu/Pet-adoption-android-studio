package com.example.petadoptionapplication;

public class Animal {

    String animalName;
    double animalWeight;
    String animalFurType;
    boolean doesAnimalShed;



    Animal(String name, double weight, String furType, boolean doesShed) {
        animalName = name;
        animalWeight = weight;
        animalFurType = furType;
        doesAnimalShed = doesShed;
    }
}
