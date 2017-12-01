package com.example.dell.fsdevparty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txt1=findViewById(R.id.login);
        txt2=findViewById(R.id.pass);

        Intent intent=getIntent();
        String login=intent.getStringExtra("nombre");
        String pass=intent.getStringExtra("password");
        txt1.setText(login);
        txt2.setText(pass);
    }
}
