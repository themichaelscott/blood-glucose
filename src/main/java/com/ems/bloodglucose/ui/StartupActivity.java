package com.ems.bloodglucose.ui;

import android.app.Activity;
import android.os.Bundle;

import com.ems.bloodglucose.Analytics;
import com.ems.bloodglucose.App;
import com.ems.bloodglucose.BuildConfig;
import com.ems.bloodglucose.R;
import com.ems.bloodglucose.task.StartupTask;
import com.google.android.gms.analytics.HitBuilders;

import javax.inject.Inject;

public class StartupActivity extends Activity {

    @Inject
    StartupTask startupTask;

    @Inject
    Analytics analytics;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        App.getInjectComponent(this).inject(this);

        analytics.send(new HitBuilders.EventBuilder()
                .setCategory(Analytics.CATEGORY_APP)
                .setAction(Analytics.ACTION_APP_LAUNCH)
                .setLabel(BuildConfig.BUILD_TYPE)
                .build());

        startup();
    }

    private void startup() {
        startupTask.init(this).execute("");
    }

}
