package com.example.recyclingview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
 ArrayList<Recycling>recyclingArrayList=new ArrayList<Recycling>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseList();
        setSetUpRecycler();

    }

    private void initialiseList()
    {
        Recycling travel=new Recycling("0","Travel",R.drawable.bus,"bus");
        recyclingArrayList.add(travel);

        Recycling makeup=new Recycling("1","Makeup",R.drawable.makeup,"makeup");
        recyclingArrayList.add(makeup);
        Recycling beauty=new Recycling("2","Beauty",R.drawable.beauty,"Beauty");
        recyclingArrayList.add(beauty);
        
    }
public void setSetUpRecycler()
{
    recyclerView =(RecyclerView)findViewById(R.id.recycleview);
  RecycleAdapter recycleAdapter=new RecycleAdapter(recyclingArrayList);
  RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),3);
  recyclerView.setLayoutManager(layoutManager);
  recyclerView.setAdapter(recycleAdapter);
}}