package com.leafyjava.tutorials.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Composite - One implementation of a member that extends hierarchical tree.
 *
 * There could be more different implementation of the composite members.
 * This is a linked list implementation for the data structure.
 */
public class LinkedScene extends AbstractScene {
    private List<Scene> members = new LinkedList<>();

    public LinkedScene(final long id, final double yaw, final double pitch) {
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
