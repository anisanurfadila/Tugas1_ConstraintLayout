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
                tvnomor.setText("1238929");
                break;
            case "ilham":
                tvnama.setText("Ilham Mubarok");
                tvnomor.setText("243739");
                break;
            case "eris":
                tvnama.setText("Erisna sutisna");
                tvnomor.setText("32387923");
                break;
            case "fikri":
                tvnama.setText("fikri fadlu");
                tvnomor.setText("4372732");
                break;
            case "maul":
                tvnama.setText("Maulana hidayah");
                tvnomor.setText("5983239");
                break;
            case "intan":
                tvnama.setText("Intan perwari");
                tvnomor.setText("623989832");
                break;
            case "vina":
                tvnama.setText("vina panduwinata");
                tvnomor.setText("72399237");
                break;
            case "gita":
                tvnama.setText("gita gutawa");
                tvnomor.setText("8237323");
                break;
            case "vian":
                tvnama.setText("Vian Munawaroh");
                tvnomor.setText("9238723");
                break;
            case "lutfi":
                tvnama.setText("Lutfiatun");
                tvnomor.setText("10329832");
                break;
        }

    }
}