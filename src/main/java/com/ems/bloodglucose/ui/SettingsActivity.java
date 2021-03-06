package com.ems.bloodglucose.ui;

import android.content.Intent;
import android.os.Bundle;

import com.ems.bloodglucose.App;
import com.ems.bloodglucose.R;


public class SettingsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getInjectComponent(this).inject(this);
        setContentView(R.layout.activity_single_fragment_no_toolbar);

        enableActionBarBackArrow(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_pos1, SettingsFragment.newInstance()).commit();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // This has to be here for onActivityResult to work in the fragment
        super.onActivityResult(requestCode, resultCode, data);
    }
}