package com.example.a16_app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent it= getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            String nome = params.getString("nome");
            Double p1 = params.getDouble("p1");
            Double p2 = params.getDouble("p2");
            Integer freq = params.getInt("freq");

            TextView nomeView = findViewById(R.id.nomin);
            TextView medView = findViewById(R.id.media);
            TextView freqView = findViewById(R.id.frequencia);
            TextView situView = findViewById(R.id.situacao);

            Double med = ((p1 + p2)/2);
            String medi = String.valueOf(med);

            nomeView.setText(nome);
            medView.setText("media: " + medi);
            freqView.setText("frequência: " + freq);

            if (freq<75) {
                situView.setText("Reprovado por frequência");
                freqView.setTextColor(Color.RED);
                situView.setTextColor(Color.RED);
                if(med<4){
                    medView.setTextColor(Color.RED);
                }
            }
            else{
                if(med<4){
                    situView.setText("Reprovado por nota");
                    medView.setTextColor(Color.RED);
                    situView.setTextColor(Color.RED);
                }
                else{
                    if(med<7){
                        situView.setText("Exame");
                        situView.setTextColor(Color.YELLOW);
                        medView.setTextColor(Color.YELLOW);
                        freqView.setTextColor(Color.GREEN);
                    }
                    else{
                        situView.setText("Aprovado");
                        situView.setTextColor(Color.GREEN);
                        medView.setTextColor(Color.GREEN);
                        freqView.setTextColor(Color.GREEN);
                    }
            }
            }
        }
    }
}