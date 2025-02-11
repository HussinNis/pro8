package com.example.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        setContentView(R.layout.activity_main);
        initDialog();
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
                //
                //
                d.dismiss();
            }
        });
    }

}