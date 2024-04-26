package com.akshaysworld.fourbuttonswithbackground;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.akshaysworld.fourbuttonswithbackground.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundColor(Color.RED);
            }
        });
        binding.blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundColor(Color.BLUE);
            }
        });
        binding.green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundColor(Color.GREEN);
            }
        });
        binding.yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}