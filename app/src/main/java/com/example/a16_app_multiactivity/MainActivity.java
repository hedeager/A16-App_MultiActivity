package com.example.a16_app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chama(View view){
        EditText nome = findViewById(R.id.nominho);
        EditText p1 = findViewById(R.id.pr1);
        EditText p2 = findViewById(R.id.pr2);
        EditText fr = findViewById(R.id.freq);

        String nom = nome.getText().toString().trim();
        Double prova1 = Double.parseDouble(p1.getText().toString());
        Double prova2 = Double.parseDouble(p2.getText().toString());
        Integer frequ = Integer.parseInt(fr.getText().toString());

        Intent it = new Intent(this, Tela2.class);
        Bundle params = new Bundle();
        params.putString("nome", nom);
        params.putDouble("p1", prova1);
        params.putDouble("p2", prova2);
        params.putInt("freq", frequ);
        it.putExtras(params);
        startActivity(it);
    }

}