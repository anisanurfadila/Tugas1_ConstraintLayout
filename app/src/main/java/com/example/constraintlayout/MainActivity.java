package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText emailEd, passwordEd;
    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnSignin);
        emailEd = findViewById(R.id.edEmail);
        passwordEd = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = emailEd.getText().toString();
                password = passwordEd.getText().toString();

                String email="anisanfd925@gmail.com";
                String pass="abc123";

                if(nama.equals(email) && password.equals(pass))
                {
                    Toast t = Toast.makeText(getApplicationContext(),"login sukses", Toast.LENGTH_LONG);
                    t.show();

                }
                else
                {
                    Toast y = Toast.makeText(getApplicationContext(),"login gagall", Toast.LENGTH_LONG);
                    y.show();

                }
            }
        });
    }
}