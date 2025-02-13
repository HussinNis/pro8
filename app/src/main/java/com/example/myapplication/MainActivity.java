package com.example.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText Us,pas;
    Dialog d;
    private Button logopen,log,cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDialog();
        setContentView(R.layout.activity_main);
        logopen=findViewById(R.id.logO);
       logopen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               d.show();
           }
       });
    }
    private void initDialog() {
        d = new Dialog(this);
        d.setContentView(R.layout.mimm);
        Us=d.findViewById(R.id.Us);
        pas=d.findViewById(R.id.pas);
        log=d.findViewById(R.id.log);
        cancel=d.findViewById(R.id.can);
        d.setCancelable(true);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Us.getText().toString().equals("admin") && pas.getText().toString().equals("admin")){
                     Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                     startActivity(intent);
                     d.dismiss();
                }
                else{
                    Toast.makeText(MainActivity.this, "worng info", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d.dismiss();
            }
        });
    }

}