package com.ems.bloodglucose;

import android.app.Application;

import com.ems.bloodglucose.ui.DirectoryActivity;
import com.ems.bloodglucose.ui.AboutActivity;
import com.ems.bloodglucose.ui.DirectoryFragment;
import com.ems.bloodglucose.ui.IndividualActivity;
import com.ems.bloodglucose.ui.IndividualEditActivity;
import com.ems.bloodglucose.ui.IndividualEditFragment;
import com.ems.bloodglucose.ui.IndividualFragment;
import com.ems.bloodglucose.ui.SettingsActivity;
import com.ems.bloodglucose.ui.SettingsFragment;
import com.ems.bloodglucose.ui.StartupActivity;
import com.ems.bloodglucose.ui.adapter.DirectoryAdapter;
import com.ems.bloodglucose.ui.loader.DirectoryListLoader;
import com.ems.bloodglucose.ui.tv.TVVideoSelectionFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    // UI
    void inject(App application);
    void inject(StartupActivity target);
    void inject(DirectoryActivity target);
    void inject(DirectoryFragment target);
    void inject(IndividualActivity target);
    void inject(IndividualFragment target);
    void inject(IndividualEditActivity target);
    void inject(IndividualEditFragment target);
    void inject(SettingsActivity target);
    void inject(AboutActivity target);

    void inject(TVVideoSelectionFragment target);

    // Adapters
    void inject(DirectoryAdapter target);

    // Loaders
    void inject(DirectoryListLoader target);

    // Exported for child-components.
    Application application();

    void inject(SettingsFragment target);
}
