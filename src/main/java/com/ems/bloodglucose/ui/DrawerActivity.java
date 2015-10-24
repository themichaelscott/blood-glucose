package com.ems.bloodglucose.ui;

import android.support.annotation.StringRes;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ems.bloodglucose.ui.menu.DrawerMenu;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public abstract class DrawerActivity extends BaseActivity {

    @Inject
    DrawerMenu drawerMenu;

    @Bind(com.ems.bloodglucose.R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Bind(com.ems.bloodglucose.R.id.nav_view)
    NavigationView navigationView;

    private boolean homeIsBackButton;

    private void init(@Nonnull Toolbar toolbar , @StringRes int titleResId) {
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        toolbar.setTitle(titleResId);
        drawerMenu.setupDrawerMenu(this, drawerLayout, navigationView);
    }

    public void setupDrawerWithBackButton(@Nonnull Toolbar toolbar, @StringRes int titleResId) {
        homeIsBackButton = true;
        init(toolbar, titleResId);

        // set the back arrow in the toolbar
        enableActionBarBackArrow(true);
    }

    public void setupDrawerWithDrawerButton(@Nonnull Toolbar toolbar, @StringRes int titleResId) {
        homeIsBackButton = false;
        init(toolbar, titleResId);
        toolbar.setNavigationIcon(com.ems.bloodglucose.R.drawable.ic_menu_24dp);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            if (homeIsBackButton) {
                finish();
            } else {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
