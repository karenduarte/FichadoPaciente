package com.example.karenduarte.fichadopaciente;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaracao de variaveis

    private EditText edt_name;
    private  EditText edt_numero_leito;
    private EditText edt_pressao_arterial;
    private EditText edt_batimentos_cardiacos;
    private EditText edt_temperatura_corporal;
    private Button btnEnviar;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // puxando os ids da activity

        edt_name = findViewById(R.id.edt_name);
        edt_numero_leito = findViewById(R.id.edt_numero_leito);
        edt_pressao_arterial = findViewById(R.id.edt_pressao_arterial);
        edt_batimentos_cardiacos = findViewById(R.id.edt_batimento_cardiacos);
        edt_temperatura_corporal = findViewById(R.id.edt_temperatura_corporal);
        btnEnviar = findViewById(R.id.btnenviar);


        btnEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Main2Activity.class);

                // usando o bundle e intent para conseguir mandar os dados para outra activity

                Bundle bundle = new Bundle();

                bundle.putString("paciente", edt_name.getText().toString());
                bundle.putInt("leito", Integer.parseInt(edt_numero_leito.getText().toString()));
                bundle.putInt("pressao", Integer.parseInt(edt_pressao_arterial.getText().toString()));
                bundle.putInt("batimentos", Integer.parseInt(edt_batimentos_cardiacos.getText().toString()));
                bundle.putInt("temperatura", Integer.parseInt(edt_temperatura_corporal.getText().toString()));

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}