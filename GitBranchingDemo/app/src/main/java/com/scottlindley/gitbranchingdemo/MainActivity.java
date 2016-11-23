package com.scottlindley.gitbranchingdemo;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;

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
        mRecycler = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new GitStuffAdapter(mActors);
        mRecycler.setLayoutManager(manager);
        mRecycler.setAdapter(mAdapter);

        mTitleText = (TextView) findViewById(R.id.actor_list);

        new AsyncTask<Void, String, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    publishProgress(new String[]{"magenta","yellow"});
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    publishProgress(new String[]{"yellow","magenta"});
                }
            }

            @Override
            protected void onProgressUpdate(String... values) {
                super.onProgressUpdate(values);
                int color1, color2;
                if(values[0].equals("yellow")){
                    color1 = Color.YELLOW;
                    color2 = Color.MAGENTA;
                }else{
                    color1 = Color.MAGENTA;
                    color2 = Color.YELLOW;
                }
                mTitleText.setBackgroundColor(color1);
                mTitleText.setTextColor(color2);
            }
        }.execute();

        Actor me = new Actor("Jon", "Yesterday", 2);
        Actor Jay = new Actor("Jay", "Unknown, maybe the late 1700s", 0);
        Actor Scott = new Actor("Scott", "At some point in time", -1);
        mActors.add(me);
        mActors.add(Jay);
        mActors.add(Scott);
        mAdapter.notifyDataSetChanged();

    }
}
