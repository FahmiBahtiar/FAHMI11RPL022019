package com.example.fahmi11rpl022019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUtama extends AppCompatActivity {
    CardView menu1;
    CardView menu2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        menu1 =(CardView)findViewById(R.id.menu1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), List.class));
            }
        });
        menu2 = (CardView)findViewById(R.id.menu2);

    }
}