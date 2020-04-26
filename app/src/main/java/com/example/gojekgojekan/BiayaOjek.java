package com.example.gojekgojekan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BiayaOjek extends AppCompatActivity {

    EditText etKilometer;
    Button btnTotal;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biaya_ojek);

        etKilometer = (EditText) findViewById(R.id.et_kilometer);
        btnTotal = (Button) findViewById(R.id.btn_total_biaya);
        tvTotal = (TextView) findViewById(R.id.tv_total);
    }

    public void totalBiaya(View view) {
        if (TextUtils.isEmpty(etKilometer.getText())) {
            etKilometer.setError("Error");
            return;
        }
        String total = etKilometer.getText().toString();
        int totalAngka = Integer.parseInt(total);
        int hasil = hitungHarga(totalAngka);
        displayMessage(hasil);

        Toast.makeText(this, "" + hasil, Toast.LENGTH_SHORT).show();
    }

    private int hitungHarga(int total) {
        int hargaPerKilometer = 1000;
        int hasilKali = total * hargaPerKilometer;
        return hasilKali;
    }

    private String hasil(String total) {
        String totalHasil = "";

        totalHasil = total;
        return totalHasil;
    }

    private void displayMessage(int hasil) {
        tvTotal.setText(".Rp." + hasil);
    }
}

