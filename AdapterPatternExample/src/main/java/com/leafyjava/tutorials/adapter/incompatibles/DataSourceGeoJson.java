package com.leafyjava.tutorials.adapter.incompatibles;

public class DataSourceGeoJson {
    private String name;
    private String featureType;
    private String spacialReference;

    public DataSourceGeoJson(final String name, final String featureType, final String spacialReference) {
        this.name = name;
        this.featureType = featureType;
        this.spacialReference = spacialReference;
    }

    public String getName() {
        return name;
    }

    public String getFeatureType() {
        return featureType;
    }

    public String getSpacialReference() {
        return spacialReference;
    }
}
