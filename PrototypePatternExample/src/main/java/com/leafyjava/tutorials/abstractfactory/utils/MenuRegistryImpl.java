package com.leafyjava.tutorials.abstractfactory.utils;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractMenuItem;
import com.leafyjava.tutorials.services.MenuService;
import com.leafyjava.tutorials.services.MenuServiceImpl;
import com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType;

import java.util.Map;

public class MenuRegistryImpl implements Registry<AbstractMenuItem> {

    private Map<MenuItemType, AbstractMenuItem> menu;

    public MenuRegistryImpl() {
        MenuService menuService = new MenuServiceImpl();
        menu = menuService.loadMenu();
    }

    @Override
    public AbstractMenuItem createItem(final Enum<MenuItemType> menuItemType) {
        AbstractMenuItem item = null;

        try {
            item = (AbstractMenuItem) menu.get(menuItemType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

}
