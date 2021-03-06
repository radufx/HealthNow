package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Inscriere extends AppCompatActivity {
    private Button button;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscriere);

        button = findViewById(R.id.inapoi_main_inscriere);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inscriere.this, MainActivity.class);
                    startActivity(intent);
                }
        });

        button = findViewById(R.id.log_pacient);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inscriere.this, PaginaStartPacient.class);
                startActivity(intent);
            }
        });

        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    protected void onStart (){
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();

    }
}