package com.leafyjava.tutorials.composite;

import java.util.ArrayList;
import java.util.List;

public class ArrayScene extends AbstractScene {
    private List<Scene> members = new ArrayList<>();

    public ArrayScene(final long id, final double yaw, final double pitch) {
        super(id, yaw, pitch);
    }

    @Override
    public Scene add(final Scene scene) {
        members.add(scene);
        return scene;
    }

    @Override
    public Scene remove(final Scene scene) {
        members.remove(scene);
        return scene;
    }

    @Override
    public List<Scene> getMembers() {
        return members;
    }
}
