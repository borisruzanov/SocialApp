package com.borisruzanov.social.mvp.view;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.borisruzanov.social.R;
import com.borisruzanov.social.mvp.view.fragments.ProfileSettingsHeightFragment;
import com.borisruzanov.social.mvp.view.fragments.ProfileSettingsKidsFragment;

public class ProfileSettingsActivity extends AppCompatActivity{

    private Fragment fragmentHeight;
    private Fragment fragmentKids;
    private FragmentTransaction ft;
    Button btnNext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_settings_activity);

        fragmentHeight = new ProfileSettingsHeightFragment();
        fragmentKids = new ProfileSettingsKidsFragment();
        ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_to_right);
        ft.replace(R.id.frame_layout_profile_settings, fragmentHeight);
        ft.addToBackStack(null);
        ft.commit();

        btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft = getSupportFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.animator.slide_in_left, R.animator.slide_to_right);
                ft.commit();
            }
        });

    }
}
