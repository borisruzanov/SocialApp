package com.borisruzanov.social.dependency.modules;

import android.content.Context;

import com.borisruzanov.social.dependency.scopes.AppScope;

import dagger.Module;
import dagger.Provides;

@Module
public class AppContextModule {

    //Define all needed instances which we are going to use during work of application
    private Context appContext;

    public AppContextModule(Context appContext) {
        this.appContext = appContext;
    }

    @AppScope
    @Provides
    Context provideContext(){
        return appContext;
    }

}
