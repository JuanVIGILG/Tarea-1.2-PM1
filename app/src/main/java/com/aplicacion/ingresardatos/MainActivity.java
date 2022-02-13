package com.aplicacion.ingresardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tv1 = (EditText)findViewById(R.id.txtnombre);
        EditText tv2 = (EditText)findViewById(R.id.txtapellido);
        EditText tv3 = (EditText)findViewById(R.id.txtedad);
        EditText tv4 = (EditText)findViewById(R.id.txtemail);
        Button btn = (Button)findViewById(R.id.enviar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Dato = "Nombre: " + tv1.getText().toString() + "\n"+"\n"
                        + "Apellido: " + tv2.getText().toString() + "\n"+"\n"
                        + "Edad: " + tv3.getText().toString() + "\n"+"\n"
                        + "Email: " + tv4.getText().toString();

                Intent pantalla = new Intent(getApplicationContext(), Datos.class);
                pantalla.putExtra("Resultado", Dato);
                startActivity(new Intent(pantalla));
            }
        });
    }
}