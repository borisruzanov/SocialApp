package com.borisruzanov.social.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.borisruzanov.social.R;
import com.borisruzanov.social.base.BaseActivity;
import com.borisruzanov.social.utils.FacebookAuthenticationUtil;
import com.borisruzanov.social.utils.FirebaseAuthenticationUtil;

import butterknife.BindView;

public class AuthPage extends BaseActivity {

    //TODO Create AuthPagePresenter
    //TODO Create AuthPageView
    //TODO Create AuthPage
    //TODO Create Interactor
    //TODO Create Repository
    //TODO Intent to BoardActivity
    //TODO Create BoardActivity
    //TODO Create BoardActivity.xml
    //TODO Implements methods for Google Authentication
    //TODO Implements methods for Facebook Authentication

    @BindView(R.id.status)
    TextView mStatusTextView;

    @BindView(R.id.google_btn)
    Button googleAuthBtn;

    @BindView(R.id.facebook_btn)
    Button facebookAuthBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_activity);

        googleAuthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(AuthPage.this, FirebaseAuthenticationUtil.class);
                startActivity(googleIntent);
            }
        });

        facebookAuthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(AuthPage.this, FacebookAuthenticationUtil.class);
                startActivity(googleIntent);
            }
        });
    }
}
