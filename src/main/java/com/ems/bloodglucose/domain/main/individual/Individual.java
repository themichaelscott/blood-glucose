/*
 * Individual.java
 *
 * Created: 10/02/2012 01:40:29
 */



package com.ems.bloodglucose.domain.main.individual;

import android.database.Cursor;
import android.content.ContentValues;


public class Individual extends IndividualBaseRecord {


    public Individual(Cursor cursor) {
        setContent(cursor);
    }

    public Individual(ContentValues values) {
        setContent(values);
    }

    public Individual() {
    }



    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}