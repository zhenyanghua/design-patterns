package com.leafyjava.tutorials.abstractfactory.utils;

import com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType;

public interface Registry<T> {
    T createItem(Enum<MenuItemType> menuItemTypeEnum);
}
