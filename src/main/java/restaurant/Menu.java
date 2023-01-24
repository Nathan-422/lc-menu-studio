package restaurant;

import java.util.Date;
import java.util.ArrayList;
public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
        this.lastUpdated = new Date();
    }

    public Menu() {
        this(new ArrayList<MenuItem>());
    }

    public boolean addMenuItem(MenuItem item) {
        if (this.menu.contains(item)) {
            return false;
        }

        this.updatedMenu();
        return this.menu.add(item);
    }

    private void updatedMenu() {
        this.lastUpdated = new Date();
    }

    public void addAllMenuItems(ArrayList<MenuItem> items) {
        for (MenuItem item : items) {
            this.addMenuItem(item);
        }
    }

    public boolean removeMenuItem(MenuItem item) {
        if (menu.contains(item)) {
            return menu.remove(item);
        }
        return false;
    }

    public void clearMenu() {
        this.menu.clear();
    }

    public void printSingleItem(String itemName) {
        for (MenuItem item : this.menu) {
            if (item.getName().contains(itemName)) {
                System.out.println(item);
                return;
            }
        }
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder();

        sb.append("~~Menu~~\n");
        sb.append("Last updated: " + this.lastUpdated + "\n\n");

        for (MenuItem item : this.menu) {
            sb.append("\n\n-------------------------------\n\n" + item);
        }

        return sb.toString();
    }
}