package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculater extends AppCompatActivity {
    EditText ed1,ed2;
    Button b;
    String s1,s2,s3;
    Integer number1,number2, number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        ed1= (EditText)findViewById(R.id.no1);
        ed2= (EditText)findViewById(R.id.no2);
        b=(Button)findViewById(R.id.sum);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1= ed1.getText().toString();
                s2= ed2.getText().toString();
                number1=Integer.parseInt(s1);
                number2= Integer.parseInt(s2);
                number3= number1+number2;

                s3= String.valueOf(number3);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
            }
        });
    }
}
