package com.example.login3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button ir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ir = (Button)findViewById(R.id.button3);

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irA = new Intent(MainActivity.this, segunda.class);

                startActivity(irA);




            }
        });



    }
}
