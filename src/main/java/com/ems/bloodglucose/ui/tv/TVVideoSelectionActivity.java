package com.ems.bloodglucose.ui.tv;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.ems.bloodglucose.R;

public class TVVideoSelectionActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_video_selection);
    }

    @Override
    public boolean onSearchRequested() {
        return true;
    }
}
