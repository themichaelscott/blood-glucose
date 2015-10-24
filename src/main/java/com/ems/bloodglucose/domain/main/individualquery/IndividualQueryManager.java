/*
 * IndividualQueryManager.java
 *
 * Generated on: 09/17/2014 03:15:27
 *
 */



package com.ems.bloodglucose.domain.main.individualquery;


import javax.inject.Inject;

@javax.inject.Singleton
public class IndividualQueryManager extends IndividualQueryBaseManager {

    @Inject
    public IndividualQueryManager() {
    }

    @Override
    public String getQuery() {
        return IndividualQuery.QUERY;
    }

}