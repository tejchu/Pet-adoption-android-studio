package com.example.petadoptionapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import static com.example.petadoptionapplication.MockCredentials.animalRex;
import static com.example.petadoptionapplication.MockCredentials.animals;

public class AnimalActivity extends AppCompatActivity {

    private AnimalsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);


        adapter = new AnimalsAdapter(animals);
        RecyclerView rvAnimals = findViewById(R.id.rv_animals);
        LinearLayoutManager llManager = new LinearLayoutManager(this);
        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvAnimals.setLayoutManager(llManager);
        rvAnimals.setAdapter(adapter);
    }
}