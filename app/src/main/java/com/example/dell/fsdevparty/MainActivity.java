package com.example.dell.fsdevparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText nombre, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        pass = findViewById(R.id.pass);

        Intent i = new Intent(this, DetailActivity.class);
        i.putExtra("nombre", nombre.getText().toString());
        i.putExtra("password", pass.getText().toString());
        startActivity(i);
    }
}
