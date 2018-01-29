package com.borisruzanov.social.dependency.modules.auth;

import com.borisruzanov.social.dependency.scopes.AuthScope;
import com.google.firebase.auth.FirebaseAuth;

import dagger.Module;
import dagger.Provides;

@Module
public class FirebaseAuthModule {

    //Constructor we can use if in activity we will pass something into module to get some result

    // Add to AuthScope
    // Parameter we could get from Component threw 'dependency' or module
    @AuthScope
    @Provides
    FirebaseAuth provideFirebaseAuth(){
        //realization of getting needed instance
        return FirebaseAuth.getInstance();
    }
}
