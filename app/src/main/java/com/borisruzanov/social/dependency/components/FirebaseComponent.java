package com.borisruzanov.social.dependency.components;

import com.borisruzanov.social.dependency.modules.auth.FacebookAuthModule;
import com.borisruzanov.social.dependency.modules.auth.FirebaseAuthModule;
import com.borisruzanov.social.dependency.modules.auth.GoogleAuthModule;
import com.borisruzanov.social.dependency.scopes.AuthScope;
import com.borisruzanov.social.utils.FacebookAuthenticationUtil;
import com.borisruzanov.social.utils.FirebaseAuthenticationUtil;

import dagger.Component;

// List of modules which we will use with this FirebaseAuth component
// Dependencies give permit to Application global graph
@AuthScope
@Component(modules = {FirebaseAuthModule.class, FacebookAuthModule.class,
        GoogleAuthModule.class}/*, dependencies = AppComponent.class*/)
public interface FirebaseComponent {

    // List of Activities where we are going to make injections
    // 'inject' method which we will use in FirebaseAuthenticationUtil to get
    void inject (FirebaseAuthenticationUtil firebaseAuthenticationUtil);
    void inject (FacebookAuthenticationUtil facebookAuthenticationUtil);
}
