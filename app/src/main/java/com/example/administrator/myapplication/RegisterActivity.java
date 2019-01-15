package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
Button b1,b2;
String name,admsno,mobno,email,username1,password,confmpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.admno);
        ed3=(EditText)findViewById(R.id.mob);
        ed4=(EditText)findViewById(R.id.email);
        ed5=(EditText)findViewById(R.id.uname);
        ed6=(EditText)findViewById(R.id.pass);
        ed7=(EditText)findViewById(R.id.conpass);
        b1=(Button)findViewById(R.id.register);
        b2=(Button)findViewById(R.id.alreadyreg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = ed1.getText().toString();
                admsno = ed2.getText().toString();
                mobno = ed3.getText().toString();
                email = ed4.getText().toString();
                username1 = ed5.getText().toString();
                password = ed6.getText().toString();
                confmpass = ed7.getText().toString();
                if (password.equals(confmpass)) {
                    Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), admsno, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), mobno, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), email, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), username1, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), password, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), confmpass, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Incorrect password", Toast.LENGTH_LONG).show();
                }
            }
        });
//
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i1);
            }
        });
    }
}
