package com.aplicacion.ingresardatos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        TextView tv5 = (TextView)findViewById(R.id.Tresultado);
        String dato = getIntent().getStringExtra("Resultado");
        tv5.setText("" + dato);
    }
}