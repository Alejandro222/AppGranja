package com.example.alejandro.migranja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.alejandro.migranja.Objetos.FirebaseReferences;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnIngreso,btnSalida,btnMostrar,btnVitamina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIngreso = (Button)  findViewById(R.id.btnIngreso);
        btnSalida = (Button)  findViewById(R.id.btnSalida);
        btnMostrar = (Button)  findViewById(R.id.btnMostrar);
        btnVitamina = (Button)  findViewById(R.id.btnVitamina);

        btnMostrar.setOnClickListener(this);
        btnVitamina.setOnClickListener(this);
        btnIngreso.setOnClickListener(this);
        btnSalida.setOnClickListener(this);

        // firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference granjaRef = database.getReference(FirebaseReferences.APP_REFERENCE);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnIngreso:
                Intent intent = new Intent(this,Ingreso.class);

              //  intent.putExtra("DATO",dato);
                startActivity(intent);

                break;
            case R.id.btnSalida:
                Intent intent1 = new Intent(this,Salida.class);

                //  intent.putExtra("DATO",dato);
                startActivity(intent1);
                break;
            case R.id.btnMostrar:
                Intent intent2 = new Intent(this,Mostrar.class);

                //  intent.putExtra("DATO",dato);
                startActivity(intent2);
                break;
            case R.id.btnVitamina:
                Intent intent3 = new Intent(this,Vitamina.class);

                //  intent.putExtra("DATO",dato);
                startActivity(intent3);
                break;
            default:
                Toast.makeText(this,"Seleccione una opcion",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
