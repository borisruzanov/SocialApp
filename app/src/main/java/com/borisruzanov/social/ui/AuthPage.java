package com.borisruzanov.social.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.borisruzanov.social.R;
import com.borisruzanov.social.mvp.view.ProfileSettingsActivity;

public class AuthPage extends AppCompatActivity {

    Button googleAuthBtn;
    Button facebookAuthBtn;
    Button phoneAuthBtn;
    Button profilePageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_activity);

        googleAuthBtn = (Button) findViewById(R.id.google_btn);
        facebookAuthBtn = (Button) findViewById(R.id.facebook_btn);
        phoneAuthBtn = (Button) findViewById(R.id.phone_btn);
        profilePageBtn = (Button) findViewById(R.id.btn_profile_page);

        googleAuthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(AuthPage.this, GoogleSignInActivity.class);
                startActivity(googleIntent);
            }
        });

        facebookAuthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(AuthPage.this, FacebookLoginActivity.class);
                startActivity(googleIntent);
            }
        });

        phoneAuthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(AuthPage.this, PhoneAuthActivity.class);
                startActivity(googleIntent);
            }
        });

        profilePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntents = new Intent(AuthPage.this, ProfileSettingsActivity.class);
                startActivity(profileIntents);
            }
        });
    }
}
