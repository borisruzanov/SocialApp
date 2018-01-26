package com.borisruzanov.social;

import android.app.Application;

import com.borisruzanov.social.dependency.components.AppComponent;
import com.borisruzanov.social.dependency.components.DaggerAppComponent;
import com.borisruzanov.social.dependency.modules.AppContextModule;

public class App extends Application {

    //Initialize Application graph
    public static AppComponent graph;

    @Override
    public void onCreate() {
        super.onCreate();

        //Creating Dagger main component for the whole application
        //Define module for this component as AppContextModule.java
        graph = DaggerAppComponent.builder().appContextModule(new AppContextModule(getApplicationContext())).build();
    }

}
