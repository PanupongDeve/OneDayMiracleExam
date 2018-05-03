package com.example.panupong.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] resId = {R.drawable.ic_action_github, R.drawable.ic_action_google_play};
        String[] list = {"GitHub", "Google Play"};

        List<Actor> heroes = new ArrayList<Actor>();
        for(int i=0;i<list.length;i++)
            heroes.add(new Actor(list[i], resId[i]));

        //setUp RecycleView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvMovies);
        adapter = new RecyclerViewAdapter(this, heroes);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Click: " + adapter.getItem(position) + " on row: " + position, Toast.LENGTH_SHORT).show();
    }
}
