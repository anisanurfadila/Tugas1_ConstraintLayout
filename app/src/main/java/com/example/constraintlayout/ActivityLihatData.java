package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama,tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("1");
                break;
            case "ilham":
                tvnama.setText("Ilham Mubarok");
                tvnomor.setText("2");
                break;
            case "eris":
                tvnama.setText("Erisna sutisna");
                tvnomor.setText("3");
                break;
            case "fikri":
                tvnama.setText("fikri fadlu");
                tvnomor.setText("4");
                break;
            case "maul":
                tvnama.setText("Maulana hidayah");
                tvnomor.setText("5");
                break;
            case "intan":
                tvnama.setText("Intan perwari");
                tvnomor.setText("6");
                break;
            case "vina":
                tvnama.setText("vina panduwinata");
                tvnomor.setText("7");
                break;
            case "gita":
                tvnama.setText("gita gutawa");
                tvnomor.setText("8");
                break;
            case "vian":
                tvnama.setText("Vian Munawaroh");
                tvnomor.setText("9");
                break;
            case "lutfi":
                tvnama.setText("Lutfiatun");
                tvnomor.setText("10");
                break;
        }

    }
}