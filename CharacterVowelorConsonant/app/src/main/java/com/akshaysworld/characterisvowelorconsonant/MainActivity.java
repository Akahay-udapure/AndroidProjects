package com.akshaysworld.characterisvowelorconsonant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.akshaysworld.characterisvowelorconsonant.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = binding.ch.getText().toString().toLowerCase();
                if(input.length() != 1){
                    Toast.makeText(MainActivity.this, "Please Enter only single character", Toast.LENGTH_SHORT).show();
                    return;
                }
                char ch = input.charAt(0);
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("character", ch);
                startActivity(intent);
            }
        });
    }
}