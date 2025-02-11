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
           Us=d.findViewById(R.id.Us);
           pas=d.findViewById(R.id.pas);
           logopen=d.findViewById(R.id.logO);
           log=d.findViewById(R.id.log);
           cancel=d.findViewById(R.id.can);
    }
   /*
public void logch(View view){
if(Us.equals("admin")&&pas.equals("admin")){
    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
    startActivities(intent);

}

} */
    public void open(View view) {

        Dialog d = new Dialog(this);
        d.setContentView(R.layout.mimm);
        EditText Us = d.findViewById(R.id.Us);
        Button btnSubmit1 = d.findViewById(R.id.logO);
        d.setCancelable(true);
        d.show();
    }
}