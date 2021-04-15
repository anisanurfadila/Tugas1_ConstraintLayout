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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId()== R.id.mnDaftar)
//        {
//            Intent i = new Intent(getApplicationContext(), Pendaftaran_activity.class);
//            startActivity(i);
//        }
//        return super.onOptionsItemSelected(item);
//    }

    Button btnLogin;
    EditText emailEd, passwordEd;
    String nama, password;
    TextInputLayout textmail,textpass;
    TextInputEditText mail,pwd;
    TextView blm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnSignin);
      //  emailEd = findViewById(R.id.edEmail);
     //   passwordEd = findViewById(R.id.edPassword);
        mail = findViewById(R.id.mail);
        pwd = findViewById(R.id.pwd);
        textmail = findViewById(R.id.layoutinputmail);
        textpass = findViewById(R.id.layoutinputpass);

        blm = findViewById(R.id.pendaftaran);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = mail.getText().toString();
                password = pwd.getText().toString();

                String email="acom";
                String pass="123";
            if(nama.isEmpty()||password.isEmpty()){
                textmail.setError("Email tidak boleh kosong");
                textpass.setError("Password tidak boleh kosong");
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
                    textpass.setError("Password salah");
                    Toast p = Toast.makeText(getApplicationContext(), "password salah", Toast.LENGTH_LONG);
                    p.show();
                } else if (!nama.equals(email) && password.equals(pass)) {
                    textmail.setError("Email salah");
                    Toast w = Toast.makeText(getApplicationContext(), "email salah", Toast.LENGTH_LONG);
                    w.show();
                } else {
                    textmail.setError("Email salah");
                    textpass.setError("Password salah");
                    Toast y = Toast.makeText(getApplicationContext(), "password & email salah", Toast.LENGTH_LONG);
                    y.show();

                }
            }
            }
        });

        blm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(getApplicationContext(), Pendaftaran_activity.class);


                startActivity(i);
            }
        });
    }
}