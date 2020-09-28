package com.example.SimpleCalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText vlr1, vlr2;
    Button btSoma, btSub, btMult, btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText vlr1 = (EditText) findViewById(R.id.vlr1);
        final EditText vlr2 = (EditText) findViewById(R.id.vlr2);
        final Button btSoma = (Button) findViewById(R.id.btSoma);
        final Button btSub = (Button) findViewById(R.id.btSub);
        final Button btMult = (Button) findViewById(R.id.btMult);
        final Button btDiv = (Button) findViewById(R.id.btDiv);
        final TextView res = (TextView) findViewById(R.id.tt3);
        btSoma.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(vlr1.getText().toString());
                double num2 = Double.parseDouble(vlr2.getText().toString());
                double calc = num1 + num2;
                res.setText("O resultado é: " + String.valueOf(calc));
            }
        });
        btSub.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(vlr1.getText().toString());
                double num2 = Double.parseDouble(vlr2.getText().toString());
                double calc = num1 - num2;
                res.setText("O resultado é: " + String.valueOf(calc));
            }
        });
        btMult.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(vlr1.getText().toString());
                double num2 = Double.parseDouble(vlr2.getText().toString());
                double calc = num1 * num2;
                res.setText("O resultado é: " + String.valueOf(calc));
            }
        });
        btDiv.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(vlr1.getText().toString());
                double num2 = Double.parseDouble(vlr2.getText().toString());
                double calc = num1 / num2;
                res.setText("O resultado é: " + String.valueOf(calc));
            }
        });

    }
}