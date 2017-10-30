package com.leafyjava.tutorials.adapter;

import com.leafyjava.tutorials.adapter.adapters.DataSourceGeoJsonAdapter;
import com.leafyjava.tutorials.adapter.adapters.DataSourceShapeFileAdapter;
import com.leafyjava.tutorials.adapter.domains.DataSource;
import com.leafyjava.tutorials.adapter.incompatibles.DataSourceGeoJson;
import com.leafyjava.tutorials.adapter.incompatibles.DataSourceShapeFile;

public class AdapterApplication {
    public static void main(String[] args) {
        DataSourceShapeFile shapeFileDataSource = new DataSourceShapeFile("border.shp", 4326, "Polyline");
        DataSource shapeFile = new DataSourceShapeFileAdapter(shapeFileDataSource);
        System.out.println(shapeFile);

        DataSourceGeoJson geoJsonDataSource = new DataSourceGeoJson("points.geojson", "Point", "EPSG4326");
        DataSource geoJson = new DataSourceGeoJsonAdapter(geoJsonDataSource);
        System.out.println(geoJson);
    }
}
