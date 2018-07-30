package com.cbalt.desafioevennumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NumberCallback {

    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numberEt = findViewById(R.id.numberEt);
        Button button = findViewById(R.id.calculateBtn);
        resultTv = findViewById(R.id.resultTv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = numberEt.getText().toString();
                new NumberCalculator(MainActivity.this).isEven(number);
            }
        });
    }

    @Override
    public void even(String number) {
        resultTv.setText(number + " es un número par");
    }

    @Override
    public void odd(String number) {
        resultTv.setText(number + " es un número impar");
    }

    @Override
    public void inputBlank() {
        Toast.makeText(this, "Debes ingresar un número", Toast.LENGTH_SHORT).show();
    }
}
