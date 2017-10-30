package com.leafyjava.tutorials.adapter.adapters;

import com.leafyjava.tutorials.adapter.domains.DataSource;
import com.leafyjava.tutorials.adapter.incompatibles.DataSourceShapeFile;

public class DataSourceShapeFileAdapter implements DataSource {
    private DataSourceShapeFile dataSourceShapeFile;

    public DataSourceShapeFileAdapter(DataSourceShapeFile dataSourceShapeFile) {
        this.dataSourceShapeFile = dataSourceShapeFile;
    }

    @Override
    public String getName() {
        return dataSourceShapeFile.getShapeFileName();
    }

    @Override
    public String getProjectionCode() {
        return String.valueOf(dataSourceShapeFile.getProjectionId());
    }

    @Override
    public String getSchema() {
        return dataSourceShapeFile.getShapeFileSchema();
    }

    @Override
    public String toString() {
        return "DataSourceShapeFileAdapter{" +
            "name = " + getName() + ", " +
            "projection = " + getProjectionCode() + ", " +
            "schema = " + getSchema() +
            '}';
    }
}
