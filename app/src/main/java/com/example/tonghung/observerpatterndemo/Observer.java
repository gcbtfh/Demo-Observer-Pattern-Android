package com.example.tonghung.observerpatterndemo;

/**
 * Created by tonghung on 3/30/17.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
