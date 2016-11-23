package com.scottlindley.gitbranchingdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private GitStuffAdapter mAdapter;
    private List<Actor> mActors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActors = new ArrayList<>();

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecycler = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new GitStuffAdapter(mActors);
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(mAdapter);


        Actor me = new Actor("Jon", "Yesterday", 2);
        Actor Jay = new Actor("Jay", "Unknown, maybe the late 1700s", 0);
        Actor Scott = new Actor("Scott", "At some point in time", -1);
        mActors.add(me);
        mActors.add(Jay);
        mActors.add(Scott);
        mAdapter.notifyDataSetChanged();

    }
}
