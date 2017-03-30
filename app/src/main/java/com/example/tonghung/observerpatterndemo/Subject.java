package com.example.tonghung.observerpatterndemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tonghung on 3/30/17.
 */

public class Subject {
    private List<Observer> listObservers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        listObservers.add(observer);
    }

    private void notifyAllObserver() {
        for (Observer ob : listObservers){
            ob.update();
        }
    }
}
