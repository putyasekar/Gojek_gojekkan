package com.example.gojekgojekan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void biayaOjek(View view) {
        Intent intent = new Intent(MainActivity.this, BiayaOjek.class);
        startActivity(intent);
    }

    public void goFood(View view) {
        Intent intent = new Intent(MainActivity.this,
                GoFood.class);
        startActivity(intent);

        ImageView showToast = (ImageView) findViewById(R.id.toastGofood);
        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Pesan Makanan Go-Food, Toast Berhasil", Toast.LENGTH_SHORT).show();

                ImageView showToast = (ImageView) findViewById(R.id.toastGoMart);
                showToast.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this,
                                "Pesan Go-Mart, Toast Berhasil", Toast.LENGTH_SHORT).show();

                        ImageView showToast = (ImageView) findViewById(R.id.toastGoRide);
                        showToast.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this,
                                        "Pesan Go-Ride, Toast Berhasil", Toast.LENGTH_SHORT).show();

                                ImageView showToast = (ImageView) findViewById(R.id.toastGoSend);
                                showToast.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Toast.makeText(MainActivity.this,
                                                "Pesan Go-Send, Toast Berhasil", Toast.LENGTH_SHORT).show();

                                    }
                                });

                            }