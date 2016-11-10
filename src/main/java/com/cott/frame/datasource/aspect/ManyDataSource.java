package com.cott.frame.datasource.aspect;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class ManyDataSource extends AbstractRoutingDataSource {
    public ManyDataSource() {
    }

    protected Object determineCurrentLookupKey() {
        return ManyDataSourceSwitch.getDataSourceType();
    }
}
