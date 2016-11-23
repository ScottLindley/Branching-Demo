package com.scottlindley.gitbranchingdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jonlieblich on 11/23/16.
 */

public class ActorViewHolder extends RecyclerView.ViewHolder {
    public TextView mName, mDob, mOscars;

    public ActorViewHolder(View itemView) {
        super(itemView);

        mName = (TextView)itemView.findViewById(R.id.Name);
        mDob = (TextView)itemView.findViewById(R.id.dob);
        mOscars = (TextView)itemView.findViewById(R.id.oscars);
    }
}
