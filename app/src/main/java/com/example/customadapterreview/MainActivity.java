package com.example.customadapterreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.PeriodicSync;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> people;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people = new ArrayList<>();
        //Person person = new Person("Saad","9027283733");
        people.add( new Person("Saad","9027283733"));
        people.add( new Person("ALi","534684313"));
        people.add( new Person("Asif","5864512"));
        people.add( new Person("Adil","1213843465"));
        people.add( new Person("Amir","97511513130"));
        people.add( new Person("Owais","1234984558"));
        people.add( new Person("Mohsin","843513546"));
        people.add( new Person("Wajahat","3413953"));
        people.add( new Person("Arsheem","21313848451"));
        people.add( new Person("Kashan","8731843849"));

        //register list view
        listView = findViewById(R.id.list_view);
//        ArrayAdapter<Person> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,people);
//        listView.setAdapter(adapter);
       // Toast.makeText(this,people.get(2).toString(),Toast.LENGTH_LONG).show();

        CustomAdapter adapter = new CustomAdapter(this,people);
        listView.setAdapter(adapter);
    }
}
