package com.facebook.stetho;

import android.content.Context;
import android.util.Log;

public class Stetho {

    public static void initializeWithDefaults(Context context){
        Log.d("Stetho","initializeWithDefaults nothing");
    }

    private Stetho(){
        throw new AssertionError();
    }
}
