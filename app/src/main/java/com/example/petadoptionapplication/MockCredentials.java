package com.example.petadoptionapplication;

import java.util.ArrayList;
import java.util.List;

public class MockCredentials {

    //adopters
    public static final String username1 = "Tea";
    public static final String password1 = "Tea";

    //personnel
    public static final String password2 = "Tea";
    public static final String username2 = "Tea";


    //animals

    //dogs
    public static final String animalRex = "Rex";
            //new Animal("Rex", 20.5, "curly", true);

    public static final String animalMax = "Max";
    //cats
    public static final String animalSparky = "Sparky";
    //parrot
    public static final String animalChio = "Chio";

    public static final List<String> animals = new ArrayList<String>(){{
        animals.add(animalRex);
        animals.add(animalMax);
        animals.add(animalChio);
        animals.add(animalSparky);
    }};

}
