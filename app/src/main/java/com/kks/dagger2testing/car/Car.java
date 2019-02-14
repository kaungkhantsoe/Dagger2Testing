package com.kks.dagger2testing.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    @Inject Wheels wheels;
    public Engine engine;

//    @Inject
//    public Car(Wheels wheels, Engine engine) {
//        this.wheels = wheels;
//        this.engine = engine;
//    }

    @Inject
    public Car( Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }


    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
    
    public void drive() {
        engine.start();
        Log.d(TAG, "driving.... ");
    }
}
