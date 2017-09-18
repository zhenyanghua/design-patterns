package com.leafyjava.tutorials;

import com.leafyjava.tutorials.domains.Burger;
import com.leafyjava.tutorials.domains.Pizza;
import com.leafyjava.tutorials.utils.MenuRegistry;
import com.leafyjava.tutorials.utils.Registry;

import static com.leafyjava.tutorials.utils.enums.Doneness.MEDIUM_WELL;
import static com.leafyjava.tutorials.utils.enums.MenuItemType.*;

public class Application {
    public static void main(String[] args) {
        Registry menu = new MenuRegistry();

        Burger burger = (Burger) menu.createItem(BURGER);
        burger.setDoneness(MEDIUM_WELL);

        System.out.println(burger);
        System.out.println(burger.getName());
        System.out.println(burger.getPrice());
        System.out.println(burger.getDoneness());

        Pizza za = (Pizza) menu.createItem(PIZZA);
        za.setThinCrust(true);

        System.out.println(za);
        System.out.println(za.getName());
        System.out.println(za.getPrice());
        System.out.println(za.isThinCrust());
    }
}
