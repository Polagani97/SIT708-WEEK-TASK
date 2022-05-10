package com.example.week5_recyclerviewn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    recyclerAdapter adapter;

    String monthNames[]={"Mercedes","Red Bull","Ferrari","Williams","McLaren","Haas","Aston Martin","Alpha Tauri","Alfa Romeo","Alpine"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new recyclerAdapter(this, monthNames);
        recyclerView.setAdapter(adapter);

    }
}