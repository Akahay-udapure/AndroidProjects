package com.akshaysworld.changebackgroundimageonclick;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.akshaysworld.changebackgroundimageonclick.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundResource(R.drawable.cat);
            }
        });
        binding.dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundResource(R.drawable.dog);
            }
        });
        binding.cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundResource(R.drawable.cow);
            }
        });
        binding.hen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundResource(R.drawable.hen);
            }
        });
        binding.original.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.main.setBackgroundColor(Color.TRANSPARENT);}
        });
    }
}