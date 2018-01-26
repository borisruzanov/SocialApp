package com.borisruzanov.social.dependency.modules.auth;

import com.borisruzanov.social.dependency.scopes.AuthScope;
import com.google.firebase.auth.FirebaseAuth;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Boris on 1/26/2018.
 */

@Module
public class FirebaseAuthModule {

    FirebaseAuth firebaseAuth;

    public FirebaseAuthModule(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    @AuthScope
    @Provides
    FirebaseAuth provideFirebaseAuth(FirebaseAuth firebaseAuth){
        return firebaseAuth;
    }
    
}
