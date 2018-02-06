package com.borisruzanov.social.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.borisruzanov.social.R;
import com.borisruzanov.social.base.BaseActivity;

public class AccountsListActivity extends BaseActivity{

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v("Tag", "In On Create AccountsListActivity");
        textView = (TextView) findViewById(R.id.tv_test);
    }
}
