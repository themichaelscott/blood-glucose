package com.ems.bloodglucose.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ems.bloodglucose.InternalIntents;
import com.ems.bloodglucose.App;
import com.ems.bloodglucose.R;
import com.ems.bloodglucose.event.EditIndividualEvent;
import com.ems.bloodglucose.event.IndividualDeletedEvent;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import de.greenrobot.event.Subscribe;
import pocketknife.BindExtra;
import pocketknife.PocketKnife;

public class IndividualActivity extends DrawerActivity {

    public static final String EXTRA_ID = "INDIVIDUAL_ID";

    @Bind(R.id.ab_toolbar)
    Toolbar toolbar;

    @Inject
    InternalIntents internalIntents;

    @BindExtra(EXTRA_ID)
    long individualId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_drawer_single);
        App.getInjectComponent(this).inject(this);
        ButterKnife.bind(this);
        PocketKnife.bindExtras(this);

        setDefaultKeyMode(DEFAULT_KEYS_SEARCH_LOCAL);

        setupDrawerWithBackButton(toolbar, R.string.individual);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_pos1, IndividualFragment.newInstance(individualId))
                    .commit();
        }
    }

    @Override
    public boolean registerEventBus() {
        return true;
    }

    @Subscribe
    public void handle(EditIndividualEvent event) {
        internalIntents.editIndividual(this, event.getId());
    }

    @Subscribe
    public void handle(IndividualDeletedEvent event) {
        finish();
    }
}