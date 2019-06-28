package com.example.login3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class segunda extends AppCompatActivity {

    ImageView ir3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        String [ ] personajes = { "Juan Pablo ", "Pedro Bone", "Jacinto Peinado ", "Joangel Reyes"};

        ListAdapter buckyysAdap = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, personajes);
        ListView listView1 = (ListView) findViewById(R.id.listView1);

        listView1.setAdapter(buckyysAdap);





        ir3 = (ImageView) findViewById(R.id.imageView);

        ir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir3 = new Intent (segunda.this, TercerActi.class);
                startActivity(ir3);
            }
        });

    }
}
