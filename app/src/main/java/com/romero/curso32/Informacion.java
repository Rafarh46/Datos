package com.romero.curso32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    private String nombre;
    private String fecha;
    private String telefono;
    private String email;
    private String descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);


        Bundle parametros = getIntent().getExtras();
        nombre  = parametros.getString("nombre");
        fecha  = parametros.getString("fecha");
        telefono  = parametros.getString("telefono");
        email  = parametros.getString("email");
        descripcion  = parametros.getString("descripcion");

        tvNombre = (TextView) findViewById(R.id.nombre2);
        tvFecha = (TextView) findViewById(R.id.fecha2);
        tvTelefono = (TextView) findViewById(R.id.telefono2);
        tvEmail = (TextView) findViewById(R.id.email2);
        tvDescripcion = (TextView) findViewById(R.id.descripcion2);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);




        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
