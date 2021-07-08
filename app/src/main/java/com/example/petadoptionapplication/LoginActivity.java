package com.example.petadoptionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

import static com.example.petadoptionapplication.MockCredentials.password1;
import static com.example.petadoptionapplication.MockCredentials.password2;
import static com.example.petadoptionapplication.MockCredentials.username1;
import static com.example.petadoptionapplication.MockCredentials.username2;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void handleText(View v){
        if(Objects.equals(((EditText)findViewById(R.id.usernameField)).getText().toString(), username1)
                && Objects.equals(((EditText)findViewById(R.id.passwordField)).getText().toString(), password1)){
            openAnimalActivity();
        }
        else if(Objects.equals(((EditText)findViewById(R.id.usernameField)).getText().toString(), username2)
                && Objects.equals(((EditText)findViewById(R.id.passwordField)).getText().toString(), password2)){
            openAnimalActivity();
        }
        else{
            ((TextView)findViewById(R.id.logintitle)).setText("Incorrect username or password...");
            ((TextView)findViewById(R.id.usernameField)).setText("");
            ((TextView)findViewById(R.id.passwordField)).setText("");
        }
    }

    public void openAnimalActivity(){
        Intent intent = new Intent(this, AnimalActivity.class);
        startActivity(intent);
    }

}
