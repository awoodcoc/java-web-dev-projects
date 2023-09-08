package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //MAKING ITEMS
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "A pizza", 10.90, "Main course");
        MenuItem item2 = new MenuItem("T Ravs", "Delicious ravs", 5.50, "Appetizer");
        MenuItem item3 = new MenuItem("Gooey Butter Cake", "Delicious cake", 8.99, "Dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza", "OK za", 9.99, "Main course");
        MenuItem item5 = new MenuItem("Garlic Bread", "awesome", 4.25, "Appetizer");
        System.out.println(item1);
        System.out.println(item2.isNew());

        // CREATE MENU
        Menu ourMenu = new Menu();
        ourMenu.addMenuItem(item1);
        ourMenu.addMenuItem(item2);
        ourMenu.addMenuItem(item3);
        ourMenu.addMenuItem(item5);
        ourMenu.addMenuItem(item4);
        System.out.println(ourMenu);

        ourMenu.removeMenuItem(item1);
        System.out.println(ourMenu);

        // TEST EQUALS
        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("Pepperoni Pizza", "Another kind of Za", 11.90, "Main course");

        System.out.println(item1.equals(item6));


        // BONUS MISSION
    }
}