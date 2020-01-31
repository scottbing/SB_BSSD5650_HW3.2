package com.company;

import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> mObservers = new ArrayList<Observer>();
    private int mState;

    public int getmState() {
        return mState;
    }

    public void setmState(int mState) {
        this.mState = mState;
        notifyAllObervers();
    }

    private void notifyAllObervers() {
        for(Observer observer : mObservers) {
            observer.update();
        }
    }

}
