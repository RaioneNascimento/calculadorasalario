package com.example.calculadorasalario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Button btnVoltar = (Button)findViewById(R.id.btnVoltar);

        Intent intent = getIntent();

        double salarioBruto = intent.getDoubleExtra(MainActivity.SALARIO_BRUTO, 0);
        int dependentes = intent.getIntExtra(MainActivity.DEPENDENTES, 0);
        double descontos = intent.getDoubleExtra(MainActivity.DESCONTOS, 0);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultsActivity.this, MainActivity.class);

                startActivity(intent);


            }
        });
    }
}