package com.leafyjava.tutorials.adapter.incompatibles;

public class DataSourceShapeFile {
    private String shapeFileName;
    private int projectionId;
    private String shapeFileSchema;

    public DataSourceShapeFile(final String shapeFileName, final int projectionId, final String shapeFileSchema) {
        this.shapeFileName = shapeFileName;
        this.projectionId = projectionId;
        this.shapeFileSchema = shapeFileSchema;
    }

    public String getShapeFileName() {
        return shapeFileName;
    }

    public int getProjectionId() {
        return projectionId;
    }

    public String getShapeFileSchema() {
        return shapeFileSchema;
    }
}
