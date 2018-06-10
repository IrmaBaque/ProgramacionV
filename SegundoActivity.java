package com.example.felix.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    //beton anterior
    public void Anterior (View view){
        //Intent siguiente = new Intent(this, SegundoActivity.class);
        Intent anterior = new Intent(this, MainActivity.class);
        TextView texto1=(TextView) findViewById(R.id.textView3);
        texto1.setText(getIntent().getStringExtra("Irma Baque Paredes"));
        TextView texto2 = (TextView) findViewById(R.id.textView5);
        texto2.setText(getIntent().getStringExtra("0925828550"));
        TextView texto3 = (TextView) findViewById(R.id.textView8);
        texto3.setText(getIntent().getStringExtra("D Cdla. Los Esteros"));
        TextView texto4 = (TextView) findViewById(R.id.textView12);
        texto4.setText(getIntent().getStringExtra(" Escuela Isabel Morlas"));
        TextView texto5 = (TextView) findViewById(R.id.textView14);
        texto5.setText(getIntent().getStringExtra("Colegio Amarilis Fuentes Alcivar"));
        TextView texto6 = (TextView) findViewById(R.id.textView16);
        texto6.setText(getIntent().getStringExtra(" Universidad de Guayaquil"));
        TextView tex6 = (TextView) findViewById(R.id.textView19);
        tex6.setText(getIntent().getStringExtra(" SubDireccion Aviacion Civil"));
        TextView tx6 = (TextView) findViewById(R.id.textView21);
        tx6.setText(getIntent().getStringExtra("av. Las Americas"));
        TextView te6 = (TextView) findViewById(R.id.textView24);
        te6.setText(getIntent().getStringExtra("Sav. Las Americas"));
        TextView text6 = (TextView) findViewById(R.id.textView26);
        text6.setText(getIntent().getStringExtra("0967308874"));
        startActivity(anterior);
       // startActivity(siguiente);
    }
}
