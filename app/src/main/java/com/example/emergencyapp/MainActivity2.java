package com.example.emergencyapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView textcase;
    private TextView textview;
    private ImageView imgview;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("case_id");

        CasesMockup c = CasesMockup.cases[id];

        imgview = findViewById(R.id.imgview);
        imgview.setImageResource(c.getImage());

        textcase= findViewById(R.id.textcase);
        textcase.setText(c.getName());


        textview= findViewById(R.id.textview);
        textview.setText(c.getInstructions());
        button=findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(i);
        });

    }



}
