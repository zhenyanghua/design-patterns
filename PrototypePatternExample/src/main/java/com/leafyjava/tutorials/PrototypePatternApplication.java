package com.leafyjava.tutorials;

import com.leafyjava.tutorials.abstractfactory.domains.Burger;
import com.leafyjava.tutorials.abstractfactory.domains.Pizza;
import com.leafyjava.tutorials.abstractfactory.utils.MenuRegistryImpl;
import com.leafyjava.tutorials.abstractfactory.utils.Registry;

import static com.leafyjava.tutorials.abstractfactory.utils.enums.Doneness.MEDIUM_WELL;
import static com.leafyjava.tutorials.abstractfactory.utils.enums.Doneness.RARE;
import static com.leafyjava.tutorials.abstractfactory.utils.enums.MenuItemType.*;

public class PrototypePatternApplication {
    public static void main(String[] args) {
        Registry menu = new MenuRegistryImpl();

        Burger burger = (Burger) menu.createItem(BURGER);
        burger.setDoneness(MEDIUM_WELL);

        System.out.println(burger);
        System.out.println(burger.getName());
        System.out.println(burger.getPrice());
        System.out.println(burger.getDoneness());

        Burger burger2 = (Burger) menu.createItem(BURGER);
        burger2.setDoneness(RARE);

        System.out.println(burger2);
        System.out.println(burger2.getName());
        System.out.println(burger2.getPrice());
        System.out.println(burger2.getDoneness());

        Pizza za = (Pizza) menu.createItem(PIZZA);
        za.setThinCrust(true);

        System.out.println(za);
        System.out.println(za.getName());
        System.out.println(za.getPrice());
        System.out.println(za.isThinCrust());
    }
}
