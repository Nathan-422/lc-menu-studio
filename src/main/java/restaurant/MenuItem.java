package restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private int price;
    private String description;
    private Catagory mealCategory;
    private Date itemCreatedOn;

    public MenuItem(String name, int price, String description, Catagory mealCategory) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.mealCategory = mealCategory;
        this.itemCreatedOn = new Date();
    }

    // todo: getters and setters

    // todo: Implement me
    public boolean isNew() {
        return false;
    }


}