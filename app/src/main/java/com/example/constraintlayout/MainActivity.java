package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), Pendaftaran_activity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

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

                String email="acom";
                String pass="123";
            if(nama.isEmpty()||password.isEmpty()){
                Toast t = Toast.makeText(getApplicationContext(),"email password wajib diisi", Toast.LENGTH_LONG);
                t.show();
            }
            else {
                if (nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(), "login sukses", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), Home_Activity.class);
                    i.putExtras(b);

                    startActivity(i);

                } else if (nama.equals(email) && !password.equals(pass)) {
                    Toast p = Toast.makeText(getApplicationContext(), "password salah", Toast.LENGTH_LONG);
                    p.show();
                } else if (!nama.equals(email) && password.equals(pass)) {
                    Toast w = Toast.makeText(getApplicationContext(), "email salah", Toast.LENGTH_LONG);
                    w.show();
                } else {
                    Toast y = Toast.makeText(getApplicationContext(), "password & email salah", Toast.LENGTH_LONG);
                    y.show();

                }
            }
            }
        });
    }
}