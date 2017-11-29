package com.leafyjava.tutorials.composite;

/**
 * Composite Abstraction
 */
public abstract class AbstractScene implements Scene{
    private long id;
    private double yaw;
    private double pitch;

    protected AbstractScene(final long id, final double yaw, final double pitch) {
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
