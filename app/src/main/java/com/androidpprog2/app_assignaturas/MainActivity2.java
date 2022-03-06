package com.androidpprog2.app_assignaturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String text_button;
    String description;
    int drawable;

    public static Intent newIntent(Context packageContext, String title, int drawable, String description) {
        Intent intent = new Intent(packageContext, MainActivity2.class);
        intent.putExtra("title",title);
        intent.putExtra("foto",drawable);
        intent.putExtra("des",description);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text_button = getIntent().getStringExtra("title");
        description = getIntent().getStringExtra("des");
        drawable = getIntent().getIntExtra("foto",R.drawable.ic_launcher_background);

        TextView button = (TextView) findViewById(R.id.first_button);
        button.setText(text_button);

        ImageView foto = (ImageView) findViewById(R.id.foto_assignatura);
        foto.setImageResource(drawable);

        TextView des = (TextView)  findViewById(R.id.descriptionAssignatura);
        des.setText(description);
    }

}