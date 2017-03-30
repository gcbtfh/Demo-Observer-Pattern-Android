package com.example.tonghung.observerpatterndemo;

import android.util.Log;

/**
 * Created by tonghung on 3/30/17.
 */

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        Log.i("HUNG", "Binary : " + Integer.toBinaryString(subject.getState()));
    }
}
