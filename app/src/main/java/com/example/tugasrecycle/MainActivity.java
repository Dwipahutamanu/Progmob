package com.example.tugasrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    myAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycle);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new myAdapter(this, getMyList());

        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<model>getMyList(){

        ArrayList<model>models = new ArrayList<>();

        model m = new model();
        m.setJudul("Virus Corona");
        m.setDeskripsi("Apa itu Covid-19");
        m.setImg(R.drawable.gmbr);
        models.add(m);

        m = new model();
        m.setJudul("Rumah Sakit");
        m.setDeskripsi("Rumah Sakit yang melayani");
        m.setImg(R.drawable.petugas_medis_lawan_korona);
        models.add(m);


        return models;

    }
}
