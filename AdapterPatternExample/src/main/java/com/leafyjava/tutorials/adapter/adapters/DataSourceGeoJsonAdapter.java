package com.leafyjava.tutorials.adapter.adapters;

import com.leafyjava.tutorials.adapter.domains.DataSource;
import com.leafyjava.tutorials.adapter.incompatibles.DataSourceGeoJson;

public class DataSourceGeoJsonAdapter implements DataSource {
    private DataSourceGeoJson dataSourceGeoJson;

    public DataSourceGeoJsonAdapter(final DataSourceGeoJson dataSourceGeoJson) {
        this.dataSourceGeoJson = dataSourceGeoJson;
    }

    @Override
    public String getName() {
        return dataSourceGeoJson.getName();
    }

    @Override
    public String getProjectionCode() {
        return dataSourceGeoJson.getSpacialReference().substring(4);
    }

    @Override
    public String getSchema() {
        return dataSourceGeoJson.getFeatureType();
    }

    @Override
    public String toString() {
        return "DataSourceGeoJsonAdapter{" +
            "name = " + getName() + ", " +
            "projection = " + getProjectionCode() + ", " +
            "schema = " + getSchema() +
            '}';
    }
}
