package com.scottlindley.gitbranchingdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
import android.support.v7.app.AppCompatActivity;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private GitStuffAdapter mAdapter;
    private List<Actor> mActors;
    private MergeConflictCreator mMergeConflictCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecycler = (RecyclerView)findViewById(R.id.recyclerView);
        mAdapter = new GitStuffAdapter(mActors);
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(mAdapter);
        mMergeConflictCreator mergeConflictCreator = new MergeConflicCreator(getApplicationContext(), LinearLayoutManager.VERTICAL, false);


    }

    private class MergeConflicCreator {
        public MergeConflicCreator(Context applicationContext, int vertical) {
            Intent intent = new Intent(String.valueOf(findViewById(R.id.recyclerView)));
            startService(intent);
        }

        public MergeConflicCreator(Context applicationContext, int vertical, boolean b) {
            return;
        }
    }
}
