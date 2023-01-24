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
        menu.clear();
    }

}