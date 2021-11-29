package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]= {"This is","Item","Item2","Another Item","new item","super","nice","superduper"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);

        // Using built in arrayAdapter.
        //ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        //listView.setAdapter(ad);

        //Using Custom Adapter
        GaganAdapter ad= new GaganAdapter(this,R.layout.my_gagan_layout,arr);
        listView.setAdapter(ad);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on "+position, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}