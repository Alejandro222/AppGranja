package com.example.alejandro.migranja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alejandro.migranja.Objetos.FirebaseReferences;
import com.example.alejandro.migranja.Objetos.Granja;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Ingreso extends AppCompatActivity {
    Button btnGuardar;
    EditText edtNombre,etxCantidad,etxFechaIngreso,edtFechaSalida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        edtNombre = (EditText) findViewById(R.id.edtNombre);
        etxCantidad = (EditText) findViewById(R.id.etxCantidad);
        etxFechaIngreso = (EditText) findViewById(R.id.etxFechaIngreso);
        edtFechaSalida = (EditText) findViewById(R.id.edtFechaSalida);



        // firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference granjaRef = database.getReference(FirebaseReferences.APP_REFERENCE);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreGrupo= edtNombre.getText().toString();
                int cantPollos = Integer.parseInt(etxCantidad.getText().toString());
                String fechaIngreso =etxFechaIngreso.getText().toString();
                String fechaSalida = edtFechaSalida.getText().toString();


                Granja granja = new Granja();
                granja.setNombreGrupo(nombreGrupo);
                granja.setCantPollos(cantPollos);
                granja.setFechaIngreso(fechaIngreso);
                granja.setFechaSalida(fechaSalida);

                granjaRef.child(FirebaseReferences.GRANJA_REFERENCE).push().setValue(granja);
            }
        });



    }
}
