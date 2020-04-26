package com.example.gojekgojekan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        getSupportActionBar().setTitle("GO FOOD");

        final EditText nama = (EditText) findViewById(R.id.edt_nama);
        final EditText alamat = (EditText) findViewById(R.id.edt_alamat);
        final EditText pesan = (EditText) findViewById(R.id.edt_pesan);
        Button order = (Button) findViewById(R.id.buttonOrder);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        OrderFood.class);
                Bundle b = new Bundle();
                b.putString("nama", nama.getText().toString());
                b.putString("alamat", alamat.getText().toString());
                b.putString("pesan", pesan.getText().toString());

                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }
}
