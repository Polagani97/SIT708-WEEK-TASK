package com.example.my_calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText operand1;
    EditText operand2;
    TextView resultOperation;

    public void addition(View view)
    {
        Double result = Double.parseDouble(operand1.getText().toString())  + Double.parseDouble(operand2.getText().toString()) ;
        resultOperation.setText(result.toString());
    }

    public void substraction(View view)
    {
        Double result = Double.parseDouble(operand1.getText().toString()) - Double.parseDouble(operand2.getText().toString()) ;
        resultOperation.setText(result.toString());
    }

    public void division(View view)
    {
        Double result = Double.parseDouble(operand1.getText().toString()) / Double.parseDouble(operand2.getText().toString()) ;
        resultOperation.setText(result.toString());
    }

    public void multiplication(View view)
    {
        Double result = Double.parseDouble(operand1.getText().toString()) * Double.parseDouble(operand2.getText().toString()) ;
        resultOperation.setText(result.toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = findViewById(R.id.operand1);
        operand2 = findViewById(R.id.operand2);
        resultOperation = findViewById(R.id.resultOperation);

    }


}
