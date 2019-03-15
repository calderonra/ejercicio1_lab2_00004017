package com.example.ejercicio1_labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button entry_btn;
    private String shortClick;
    private TextView mensaje;
    private EditText usuario;
    private String aux;
    private EditText contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entry_btn = findViewById(R.id.boton);
        mensaje = findViewById(R.id.mensaje);
        usuario = findViewById(R.id.user);
        contra = findViewById(R.id.contraseña);

        entry_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aux=usuario.getText().toString();
                shortClick=aux;
                mensaje.setText(shortClick);
            }
        });;

        entry_btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                aux=contra.getText().toString();
                shortClick=aux;
                mensaje.setText(shortClick);
                return true;
            }
        });

    }




}
