package com.leafyjava.tutorials.composite;

import java.util.Collection;

/**
 * Component - defines uniform behaviors of all members in the hierarchical tree.
 */
public interface Scene {
    long getId();
    double getYaw();
    double getPitch();

    default Scene add(Scene scene) {
        throw new UnsupportedOperationException();
    }

    default Scene remove(Scene scene) {
        throw new UnsupportedOperationException();
    }

    default Collection<Scene> getMembers() {
        return null;
    }

}
