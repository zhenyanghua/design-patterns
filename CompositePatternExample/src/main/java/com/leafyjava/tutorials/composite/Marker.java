package com.leafyjava.tutorials.composite;

/**
 * Leaf - the end of a hierarchical tree
 */
public class Marker implements Scene {
    private long id;
    private double yaw;
    private double pitch;

    public Marker(final long id, final double yaw, final double pitch) {
        this.id = id;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double getYaw() {
        return yaw;
    }

    @Override
    public double getPitch() {
        return pitch;
    }
}
