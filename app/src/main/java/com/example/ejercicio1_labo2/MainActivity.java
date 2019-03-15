package com.example.ejercicio1_labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button entry_btn;
    private String shortClick;
    private TextView Palabra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entry_btn = findViewById(R.id.boton);
        Palabra=findViewById(R.id.mensaje);

        entry_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                shortClick="username";
                Palabra.setText(shortClick);
            }
        });;

        entry_btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                shortClick="password";
                Palabra.setText(shortClick);
                return true;
            }
        });


    }




}
