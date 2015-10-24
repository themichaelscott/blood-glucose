package com.ems.bloodglucose.ui.loader;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.CursorLoader;

import com.ems.bloodglucose.App;
import com.ems.bloodglucose.domain.main.individual.IndividualManager;

import javax.inject.Inject;

public class DirectoryListLoader extends CursorLoader {
    @Inject
    IndividualManager individualManager;

    public DirectoryListLoader(Context context) {
        super(context);
        App.getInjectComponent(context).inject(this);
    }

    @Override
    public Cursor loadInBackground() {
        return individualManager.findCursorBySelection(null, null);
    }

}
