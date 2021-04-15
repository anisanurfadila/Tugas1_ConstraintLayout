package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Pendaftaran_activity extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepassword;
  //  FloatingActionButton fab;
    Button daftar, batal;

    TextInputLayout lynama,lyalamat,lyemail,lypass,lyrepass;
    TextInputEditText txnama,txalamat,txemail,txpass,txrepass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran_activity);


        //fab = findViewById(R.id.fabSimpan);
        daftar = findViewById(R.id.Daftar);
        batal = findViewById(R.id.Batal);
//        edtNama = findViewById(R.id.edNama);
//        edtAlamat = findViewById(R.id.edAlamat);
//        edtEmail = findViewById(R.id.edEmail);
//        edtPassword = findViewById(R.id.edPass);
//        edtrepassword = findViewById(R.id.edRepass);

        lynama = findViewById(R.id.lytNama);
        lyalamat = findViewById(R.id.lytAlamat);
        lyemail = findViewById(R.id.lytEmail);
        lypass = findViewById(R.id.lytPass);
        lyrepass = findViewById(R.id.lytrepass);

        txnama = findViewById(R.id.txtNama);
        txalamat = findViewById(R.id.txtAlamat);
        txemail = findViewById(R.id.txtEmail);
        txpass = findViewById(R.id.txtpass);
        txrepass = findViewById(R.id.txtrepass);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txnama.getText().toString().isEmpty()||
                        txalamat.getText().toString().isEmpty()||
                        txemail.getText().toString().isEmpty()||
                        txpass.getText().toString().isEmpty()||
                        txrepass.getText().toString().isEmpty()
                )
                {
                    lynama.setError("Nama tidak kosong ");
                    lyalamat.setError("Alamat tidak kosong ");
                    lyemail.setError("Email tidak kosong ");
                    lypass.setError("Password tidak kosong ");
                    lyrepass.setError("Re-password tidak kosong ");

                    Snackbar.make(view, "Data harus diisi semua !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                        if(txpass.getText().toString().equals(txrepass.getText().toString()))
                        {
                            Toast.makeText(getApplicationContext(),
                                    "pendaftarann berhasil...", Toast.LENGTH_LONG).show();

                            Intent i = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                        }
                        else
                        {
                            Snackbar.make(view,
                                    "password dan repassword harus sama !!!",
                                    Snackbar.LENGTH_LONG).show();
                        }
                }

            }
        });
    }


}