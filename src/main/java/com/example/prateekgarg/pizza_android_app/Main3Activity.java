package com.example.prateekgarg.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private ListView list;

    private Spinner spin;
    String data[]={"Ab","Bc","Cd","De","Ef","Fg","Gh","Hi","Ij","Jk"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.listview);

        spin=(Spinner)findViewById(R.id.s);

        ArrayAdapter adapter=new ArrayAdapter(Main3Activity.this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        spin.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=(TextView) view;
                Toast.makeText(Main3Activity.this,txt.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=(TextView)view;
                Toast.makeText(Main3Activity.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
