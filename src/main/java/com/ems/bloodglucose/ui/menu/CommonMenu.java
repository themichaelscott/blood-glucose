package com.ems.bloodglucose.ui.menu;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;

import com.ems.bloodglucose.InternalIntents;
import com.ems.bloodglucose.App;
import com.ems.bloodglucose.R;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CommonMenu {
    public static final String TAG = App.createTag(CommonMenu.class);

    @Inject
    InternalIntents internalIntents;

    @Inject
    public CommonMenu() {
    }

    public boolean onOptionsItemSelected(Context context, MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_search:
                return true;
            case R.id.menu_item_settings:
                internalIntents.showSettings(context);
                return true;
            case R.id.menu_item_about:
                internalIntents.showHelp(context);
                return true;
            default:
                Log.i(TAG, "Unknown common menu item id: " + item.getItemId() + ", ignoring");
                return false;
        }
    }
}
