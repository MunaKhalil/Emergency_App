package com.example.emergencyapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity3 extends AppCompatActivity {
    private Button openMapsButton;
    private ListView listView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        listView=findViewById(R.id.listView);
        openMapsButton=findViewById(R.id.openMapsButton);
        listView.setOnItemClickListener((AdapterView<?>parent,View view,int position,long id)->{
            String phoneNumber;
            switch(position){
                case 0:
                    phoneNumber="100";
                    break;
                case 1:
                    phoneNumber="101";
                    break;
                case 2:
                    phoneNumber="103";
                    break;
                default:
                    return;
            }
            Intent call=new Intent(Intent.ACTION_DIAL);
            call.setData(Uri.parse("tel:" +phoneNumber));
            startActivity(call);

        });
        openMapsButton.setOnClickListener(view->{
            Uri map=Uri.parse("geo:0,0?q=hospitals");
            Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=nearest+hospital"));
            startActivity(in);

        });

    }



}