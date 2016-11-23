package com.scottlindley.gitbranchingdemo;

/**
 * Created by Scott Lindley on 11/23/2016.
 */

public class Actor {
    private String mName, mDOB;
    private int mOscarsWon;

    public Actor(String name, String DOB, int oscarsWon) {
        mName = name;
        mDOB = DOB;
        mOscarsWon = oscarsWon;
    }
    
    public String getName() {
        return mName;
    }

    public String getDOB() {
        return mDOB;
    }

    public int getOscarsWon() {
        return mOscarsWon;
    }
}
