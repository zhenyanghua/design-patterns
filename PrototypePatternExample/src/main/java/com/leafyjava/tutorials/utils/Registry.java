package com.leafyjava.tutorials.utils;

import com.leafyjava.tutorials.utils.enums.MenuItemType;

public interface Registry<T> {
    T createItem(Enum<MenuItemType> menuItemTypeEnum);
}
