package com.akshaysworld.squaresquareroot;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.akshaysworld.squaresquareroot.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!binding.firstNo.getText().toString().isEmpty()){
                    try {
                        Integer num = Integer.valueOf(binding.firstNo.getText().toString());
                        Integer square = num * num;
                        binding.output.setText(String.valueOf(square));
                        Toast.makeText(MainActivity.this, "Square of the " + num + " is  " + square, Toast.LENGTH_SHORT).show();
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, "Error" + e, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.squareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!binding.firstNo.getText().toString().isEmpty()){
                    try {
                        Integer num = Integer.valueOf(binding.firstNo.getText().toString());
                        Double squareRoot = Math.sqrt(num);
                        binding.output.setText(String.valueOf(squareRoot));
                        Toast.makeText(MainActivity.this, "SquareRoot of the " + num + " is  " + squareRoot, Toast.LENGTH_SHORT).show();
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this, "Error" + e, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Please Enter The Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}