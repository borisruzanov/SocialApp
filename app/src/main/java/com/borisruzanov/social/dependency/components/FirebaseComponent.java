package com.borisruzanov.social.dependency.components;

import com.borisruzanov.social.dependency.modules.auth.FirebaseAuthModule;
import com.borisruzanov.social.dependency.scopes.AuthScope;
import com.borisruzanov.social.ui.GoogleSignInActivity;

import dagger.Component;

// List of modules which we will use with this FirebaseAuth component
// Dependencies give permit to Application global graph
@AuthScope
@Component(modules = {FirebaseAuthModule.class}, dependencies = AppComponent.class)
public interface FirebaseComponent {

    // List of Activities where we are going to make injections
    void inject (GoogleSignInActivity googleSignInActivity);
    //void inject (FacebookLoginActivity facebookLoginActivity);
}
