package com.example.formlogin;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SavedDatasetsInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_register extends AppCompatActivity {
    EditText username,password,email;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.editUsername);
        password = (EditText) findViewById(R.id.editPassword);
        email =(EditText) findViewById(R.id.editEmail);
        login= (Button) findViewById(R.id.buttonReg);
        login.setOnClickListener(new View.OnClickListener() {
            private void Save(String username, String password, String email){
            }
            public void onClick(View view) {
                String username1=username.getText().toString();
                String password1=password.getText().toString();
                String email1=email.getText().toString();
                SavedDatasetsInfo email,password,username;
                Toast.makeText(activity_register.this, "Username Anda Adalah "+username1,Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(activity_register.this,MainActivity.class);
                activity_register.this.startActivity(intent);
            }
        });
    }
}