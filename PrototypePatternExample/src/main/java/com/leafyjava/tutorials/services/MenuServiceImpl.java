package com.leafyjava.tutorials.services;

import com.leafyjava.tutorials.abstractfactory.domains.AbstractMenuItem;
import com.leafyjava.tutorials.abstractfactory.domains.Burger;
import com.leafyjava.tutorials.abstractfactory.domains.Pizza;
import com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType;

import java.util.HashMap;
import java.util.Map;

import static com.leafyjava.tutorials.abstractfactory.utils.enums.Doneness.WELL_DONE;
import static com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType.BURGER;
import static com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType.PIZZA;

public class MenuServiceImpl implements MenuService {

    @Override
    public Map<MenuItemType, AbstractMenuItem> loadMenu() {
        {
            Map<MenuItemType, AbstractMenuItem> menu = new HashMap<>();

            Burger burger = new Burger();
            burger.setName("Cheese Burger");
            burger.setPrice(8.99F);
            burger.setDoneness(WELL_DONE);
            menu.put(BURGER, burger);

            Pizza za = new Pizza();
            za.setName("Cheese Pizza");
            za.setPrice(15.99F);
            za.setThinCrust(false);
            menu.put(PIZZA, za);

            return menu;
        }
    }
}
