package com.akshaysworld.day3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RelativeActivityFunctionalCalculator extends AppCompatActivity {
    private EditText firstNo, secondNo;
    private Button btnAdd, btnSub, btnMul, btnDiv;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_relative_functional_calculator);
        firstNo = findViewById(R.id.firstNo);
        secondNo = findViewById(R.id.secondNo);
        btnAdd = findViewById(R.id.addBtn);
        btnSub = findViewById(R.id.subBtn);
        btnMul = findViewById(R.id.mulBtn);
        btnDiv = findViewById(R.id.divBtn);
        result = findViewById(R.id.resultBtn);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNo.getText().toString().isEmpty() || secondNo.getText().toString().isEmpty()){
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Please Enter Both Number", Toast.LENGTH_SHORT).show();
                }else{
                    Integer num1 = Integer.valueOf(firstNo.getText().toString());
                    Integer num2 = Integer.valueOf(secondNo.getText().toString());
                    Integer add = num1 + num2;
                    result.setText(String.valueOf(add));
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Addition is " + add, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNo.getText().toString().isEmpty() || secondNo.getText().toString().isEmpty()){
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Please Enter Both Number", Toast.LENGTH_SHORT).show();
                }else{
                    Integer num1 = Integer.valueOf(firstNo.getText().toString());
                    Integer num2 = Integer.valueOf(secondNo.getText().toString());
                    Integer sub = num1 - num2;
                    result.setText(String.valueOf(sub));
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Substraction is " + sub, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNo.getText().toString().isEmpty() || secondNo.getText().toString().isEmpty()){
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Please Enter Both Number", Toast.LENGTH_SHORT).show();
                }else{
                    Integer num1 = Integer.valueOf(firstNo.getText().toString());
                    Integer num2 = Integer.valueOf(secondNo.getText().toString());
                    Integer mul = num1 * num2;
                    result.setText(String.valueOf(mul));
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Multiplication is " + mul, Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNo.getText().toString().isEmpty() || secondNo.getText().toString().isEmpty()){
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Please Enter Both Number", Toast.LENGTH_SHORT).show();
                }else{
                    Integer num1 = Integer.valueOf(firstNo.getText().toString());
                    Integer num2 = Integer.valueOf(secondNo.getText().toString());
                    Integer div = num1 / num2;
                    result.setText(String.valueOf(div));
                    Toast.makeText(RelativeActivityFunctionalCalculator.this, "Division is " + div, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}