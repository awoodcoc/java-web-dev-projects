package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

//    public Menu(LocalDate d, ArrayList<MenuItem> i) {
//        this.lastUpdated = d;
//        this.items = i;
//    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    void addMenuItem(MenuItem newItem) {
        String message = "This item is already on the menu";
        if (items.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : items) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }

        items.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeMenuItem(MenuItem item) {
        items.remove(item);
        lastUpdated = LocalDate.now();
    }

    // New override To String
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: items) {
            if (item.getCategory().equals("Appetizer")) {
                appetizers.append("\n").append(item).append("\n");
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item: items) {
            if (item.getCategory().equals("Main course")) {
                mainCourse.append("\n").append(item).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: items) {
            if (item.getCategory().equals("Dessert")) {
                desserts.append("\n").append(item).append("\n");
            }
        }
        return "\n Tony's Big Tasty Za\n" +
                "Appetizers" + appetizers + "\n" +
                "Main courses" + mainCourse + "\n" +
                "Desserts" + desserts + "\n";
    }


}