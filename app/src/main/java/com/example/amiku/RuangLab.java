package com.example.amiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class RuangLab extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruang_lab);

        listView = findViewById(R.id.listView);

        String[] values = new String[]{
                "Lab Multimedia (LPD CLASS/LAB 1)", "PKR CLASS (LAB 2)", "CHANGBOGO (LAB)"
                , "LAB DKV"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), lpd.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(view.getContext(), pkr.class);
                    startActivity(intent);
                }

                if (position == 2){
                    Intent intent = new Intent(view.getContext(), changbogo.class);
                    startActivity(intent);
                }

                if (position == 3){
                    Intent intent = new Intent(view.getContext(), dkv.class);
                    startActivity(intent);
                }
            }
        });

    }
}