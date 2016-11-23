package com.scottlindley.gitbranchingdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/**
 * Created by jonlieblich on 11/23/16.
 */

public class GitStuffAdapter extends RecyclerView.Adapter<ActorViewHolder> {
    List<Actor> mActorList;

    public GitStuffAdapter(List<Actor> list) {
        mActorList = list;
    }

    @Override
    public ActorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ActorViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.actors));
    }

    @Override
    public void onBindViewHolder(ActorViewHolder holder, int position) {
        Actor actor = mActorList.get(position);
        holder.mName.setText(actor.getName());
        holder.mDob.setText(actor.getDob());
        holder.mOscars.setText(""+actor.getOscarsWon());
    }

    @Override
    public int getItemCount() {
        return mActorList.size();
    }
}
