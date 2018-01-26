package com.borisruzanov.social.dependency.components;

import android.content.Context;

import com.borisruzanov.social.dependency.modules.AppContextModule;
import com.borisruzanov.social.dependency.scopes.AppScope;

import dagger.Component;

@AppScope
@Component(modules = AppContextModule.class)
public interface AppComponent {

    Context getContext();

}

