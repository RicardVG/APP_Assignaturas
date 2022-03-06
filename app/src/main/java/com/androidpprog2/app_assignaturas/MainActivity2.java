package com.androidpprog2.app_assignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String text_button_android;
    ImageView foto_android;

    public static Intent newIntent(Context packageContext, String title1, int drawable, String description1) {
        Intent intent = new Intent(packageContext, MainActivity2.class);
        intent.putExtra("title1",title1);
        intent.putExtra("foto1",drawable);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text_button_android = getIntent().getStringExtra("title1");
        int id1 = getIntent().getExtras().getInt("foto1");
        TextView pepito = (TextView) findViewById(R.id.first_button);
        ImageView foto_android = (ImageView) findViewById(R.id.foto_android);
        pepito.setText(text_button_android);
        foto_android.setImageDrawable(getResources().getDrawable(id1));
    }

}