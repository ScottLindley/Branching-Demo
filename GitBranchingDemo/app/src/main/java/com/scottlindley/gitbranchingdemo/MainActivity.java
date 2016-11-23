package com.scottlindley.gitbranchingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private GitStuffAdapter mAdapter;
    private List<Actor> mActors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecycler = (RecyclerView)findViewById(R.id.recyclerView);
        mAdapter = new GitStuffAdapter(mActors);
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(mAdapter);
    }
}
