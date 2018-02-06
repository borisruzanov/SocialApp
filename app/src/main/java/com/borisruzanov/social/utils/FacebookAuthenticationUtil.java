package com.borisruzanov.social.utils;


import android.os.Bundle;
import android.widget.TextView;

import com.borisruzanov.social.base.BaseActivity;
import com.facebook.CallbackManager;
import com.google.firebase.auth.FirebaseAuth;

    public class FacebookAuthenticationUtil extends BaseActivity {

        //TODO Incapsulate all Facebook Auth methods to another class
        //TODO Create Module in Dagger for Facebook Auth
        //TODO Create Component in Dagger for Facebook Auth

    //    keytool -exportcert -alias androiddebugkey -keystore "C:\Users\Boris\.android\debug.keystore" | "D:\OpenSslLibrary\bin\openssl" sha1 -binary | "D:\OpenSslLibrary\bin\openssl" base64
        private static final String TAG = "FacebookLogin";

        private TextView mStatusTextView;
        private TextView mDetailTextView;

        // [START declare_auth]
        private FirebaseAuth mAuth;
        // [END declare_auth]

        private CallbackManager mCallbackManager;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//            setContentView(R.layout.auth_facebook_activity);
//
//            FacebookSdk.sdkInitialize(getApplicationContext());
//            if (BuildConfig.DEBUG) {
//                FacebookSdk.setIsDebugEnabled(true);
//                FacebookSdk.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
//            }
////            FacebookSdk.sdkInitialize(getApplicationContext());
//            setContentView(R.layout.auth_facebook_activity);
//
//            // Views
//            mStatusTextView = findViewById(R.id.status_tv);
//            mDetailTextView = findViewById(R.id.detail_tv);
//            findViewById(R.id.button_facebook_signout).setOnClickListener(this);
//
//            // [START initialize_auth]
//            // Initialize Firebase Auth
//            mAuth = FirebaseAuth.getInstance();
//            // [END initialize_auth]
//
//            // [START initialize_fblogin]
//            // Initialize Facebook Login button
//            mCallbackManager = CallbackManager.Factory.create();
//            LoginButton loginButton = findViewById(R.id.login_button);
////            loginButton.setReadPermissions("email", "public_profile");
//            loginButton.setReadPermissions("email");
//            loginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
//                @Override
//                public void onSuccess(LoginResult loginResult) {
//                    Log.v(TAG, "facebook:onSuccess:" + loginResult);
//                    handleFacebookAccessToken(loginResult.getAccessToken());
//                }
//
//                @Override
//                public void onCancel() {
//                    Log.v(TAG, "facebook:onCancel");
//                    // [START_EXCLUDE]
//                    updateUI(null);
//                    // [END_EXCLUDE]
//                }
//
//                @Override
//                public void onError(FacebookException error) {
//                    Log.v(TAG, "facebook:onError", error);
//                    // [START_EXCLUDE]
//                    updateUI(null);
//                    // [END_EXCLUDE]
//                }
//            });
//            // [END initialize_fblogin]
        }
//
//        // [START on_start_check_user]
//        @Override
//        public void onStart() {
//            Log.v(TAG, "FB On Start check user" );
//
//            super.onStart();
//            // Check if user is signed in (non-null) and update UI accordingly.
//            FirebaseUser currentUser = mAuth.getCurrentUser();
//            updateUI(currentUser);
//        }
//        // [END on_start_check_user]
//
//        // [START on_activity_result]
//        @Override
//        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//            super.onActivityResult(requestCode, resultCode, data);
//
//            // Pass the activity result back to the Facebook SDK
//            mCallbackManager.onActivityResult(requestCode, resultCode, data);
//            Log.v(TAG, "facebook:onActivity result");
//
//        }
//        // [END on_activity_result]
//
//        // [START auth_with_facebook]
//        private void handleFacebookAccessToken(AccessToken token) {
//            Log.v(TAG, "handleFacebookAccessToken:" + token);
//            // [START_EXCLUDE silent]
//            showProgressDialog();
//            // [END_EXCLUDE]
//
//            AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
//            Log.v(TAG, "AuthCredential: " + credential);
//            mAuth.signInWithCredential(credential)
//                    .addOnCompleteListener(FacebookAuthenticationUtil.this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if (task.isSuccessful()) {
//                                // Sign in success, update UI with the signed-in user's information
//                                Log.v(TAG, "signInWithCredential:success");
//                                FirebaseUser user = mAuth.getCurrentUser();
//                                updateUI(user);
//                            } else {
//                                // If sign in fails, display a message to the user.
//                                Log.v(TAG, "signInWithCredential:failure", task.getException());
//                                Toast.makeText(FacebookAuthenticationUtil.this, "Authentication failed.",
//                                        Toast.LENGTH_SHORT).show();
//                                updateUI(null);
//                            }
//
//                            // [START_EXCLUDE]
//                            hideProgressDialog();
//                            // [END_EXCLUDE]
//                        }
//                    });
//        }
//        // [END auth_with_facebook]
//
//        public void signOut() {
//            mAuth.signOut();
//            LoginManager.getInstance().logOut();
//
//            updateUI(null);
//        }
//
//        private void updateUI(FirebaseUser user) {
//            hideProgressDialog();
//            if (user != null) {
//                Log.v(TAG, "In update user if user null");
//
//                mStatusTextView.setText(getString(R.string.facebook_status_fmt, user.getDisplayName()));
//                mDetailTextView.setText(getString(R.string.firebase_status_fmt, user.getUid()));
//
//                findViewById(R.id.button_facebook_login).setVisibility(View.GONE);
//                findViewById(R.id.button_facebook_signout).setVisibility(View.VISIBLE);
//            } else {
//                Log.v(TAG, "In update user if user NOT null");
//
//                mStatusTextView.setText(R.string.signed_out);
//                mDetailTextView.setText(null);
//
//                findViewById(R.id.button_facebook_login).setVisibility(View.VISIBLE);
//                findViewById(R.id.button_facebook_signout).setVisibility(View.GONE);
//            }
//        }
//
//        @Override
//        public void onClick(View v) {
//            Log.v(TAG, "In On Click");
//
//            int i = v.getId();
//            if (i == R.id.button_facebook_signout) {
//                signOut();
//            }
//        }
    }
