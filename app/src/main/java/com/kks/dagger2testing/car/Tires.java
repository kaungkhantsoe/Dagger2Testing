package com.kks.dagger2testing.car;

import android.util.Log;

import java.security.PublicKey;

import javax.inject.Inject;

public class Tires {

//    We don't know this class so we can't annotate with @Inject

    private static final String TAG = "Tires";
    
    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
