package com.example.myapplication;

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

public class Login extends AppCompatActivity {
    EditText  pass;
    EditText  user;
    Button check;

    String passdata ;
    String userdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

  pass= findViewById(R.id.password);
  user = findViewById(R.id.username);
  check = findViewById(R.id.validate);
  String passcode = "root@123";
  String usercode = "root@me.com";

  check.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          String authmail =  user.getText().toString();
          String authpass =  pass.getText().toString();
                  


          try{
             if(authmail.equals(usercode) & authpass.equals(passcode)){
                 Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                 startActivity(intent);
             }else{
                 Intent intent = new Intent(getApplicationContext(), Login.class);
                 startActivity(intent);
             }
          } catch (RuntimeException e) {
              throw new RuntimeException(e);
          }
      }
  });

    }
}