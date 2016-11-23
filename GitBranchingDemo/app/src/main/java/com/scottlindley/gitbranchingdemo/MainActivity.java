package com.scottlindley.gitbranchingdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private GitStuffAdapter mAdapter;
    private List<Actor> mActors;
    private TextView mTitleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActors = new ArrayList<>();

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecycler = (RecyclerView)findViewById(R.id.recyclerView);
        mAdapter = new GitStuffAdapter(mActors);
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(mAdapter);

        mTitleText = (TextView)findViewById(R.id.actor_list);

        mTitleText.setBackgroundColor(Color.MAGENTA);

    }
}
