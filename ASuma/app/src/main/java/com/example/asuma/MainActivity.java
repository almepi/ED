package com.example.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView textResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            num1 = findViewById(R.id.Numero1);
            num2 = findViewById(R.id.Numero2);

            textResultado = findViewById(R.id.Resultado);


    }
    public void sumaoperacion(View view){

        float num1F = Float.valueOf(num1.getText().toString());
        float num2F = Float.valueOf(num2.getText().toString());

        float res = num1F + num2F;
        textResultado.setText(String.valueOf(res));




    }














}
