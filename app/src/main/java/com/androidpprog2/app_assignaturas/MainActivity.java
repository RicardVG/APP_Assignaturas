package com.androidpprog2.app_assignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button first_button;
    Button second_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_button = (Button) findViewById(R.id.button2);
        second_button = (Button) findViewById(R.id.button);
        first_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity2.newIntent(MainActivity.this, getString(R.string.desenvolupament_de_dispositius_mobils), R.drawable.foto_mobils, getString(R.string.primera_descripcion));
                startActivity(intent);
            }
        });
    }
}