/*
 * Household.java
 *
 * Created: 10/14/2013 12:14:38
 */



package com.ems.bloodglucose.domain.main.household;

import android.database.Cursor;
import android.content.ContentValues;


public class Household extends HouseholdBaseRecord {


    public Household(Cursor cursor) {
        setContent(cursor);
    }

    public Household(ContentValues values) {
        setContent(values);
    }

    public Household() {
    }


}