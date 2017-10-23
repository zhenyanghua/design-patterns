package com.leafyjava.tutorials.services;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractMenuItem;
import com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType;

import java.util.Map;

public interface MenuService {
    Map<MenuItemType, AbstractMenuItem> loadMenu();
}
