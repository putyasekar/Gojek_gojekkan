package com.example.gojekgojekan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OrderFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        Bundle b = getIntent().getExtras();
//membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.tv_nama);
        TextView alamat = (TextView) findViewById(R.id.tv_alamat);
        TextView pesan = (TextView) findViewById(R.id.tv_pesan);
        //menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        alamat.setText(b.getCharSequence("alamat"));
        pesan.setText(b.getCharSequence("pesan"));
        Button cancel = (Button) findViewById(R.id.cancelOrder);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new
                        Intent(OrderFood.this, GoFood.class);
                startActivity(intent);
            }
        });

    }





}

