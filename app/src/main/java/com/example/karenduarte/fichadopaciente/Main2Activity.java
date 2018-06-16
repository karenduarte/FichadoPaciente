package com.example.karenduarte.fichadopaciente;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText nPaciente;
    private EditText numLeito;
    private EditText pressaoArt;
    private EditText temperaturaPaciente;
    private EditText batimentosPaciente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nPaciente = findViewById(R.id.pacientedados);
        numLeito = findViewById(R.id.leitodados);
        pressaoArt = findViewById(R.id.pressaodados);
        temperaturaPaciente = findViewById(R.id.temperaturaDados);
        batimentosPaciente = findViewById(R.id.batimentodados);

        Intent intent = getIntent();

        Bundle buscar = intent.getExtras();

        String paciente = buscar.getString("paciente");
        nPaciente.setText(paciente);

        int leito = buscar.getInt("leito");
        numLeito.setText(String.valueOf(leito));

        int pressao = buscar.getInt("pressao");
        pressaoArt.setText(String.valueOf(pressao));

        int batimentos = buscar.getInt("batimentos");
        batimentosPaciente.setText(String.valueOf(batimentos));

        int temperatura = buscar.getInt("temperatura");
        temperaturaPaciente.setText(String.valueOf(temperatura));


        Button dados = (Button) findViewById(R.id.btnenviar);
        dados.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}



