package com.example.emergencyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ListView listcase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("case_id",(int)id);
                    startActivity(intent);
                }else if(position ==1){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("case_id",(int)id);
                    startActivity(intent);
                }else if(position ==2){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("case_id",(int)id);
                    startActivity(intent);
                }else if(position ==3){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("case_id",(int)id);
                    startActivity(intent);
                }else if(position ==4){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("case_id",(int)id);
                    startActivity(intent);
                }

            }

        };
        listcase=findViewById(R.id.listcase);
        listcase.setOnItemClickListener(itemClickListener);

    }
}