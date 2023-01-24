package restaurant;

import java.util.Date;
import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catagory getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(Catagory mealCategory) {
        this.mealCategory = mealCategory;
    }

    public Date getItemCreatedOn() {
        return itemCreatedOn;
    }

    public boolean isNew() {

        final Date today = new Date();
        final long ninetyDays = (long) (8.64e7 * 90);
        final long newerThanDate = today.getTime() - today.getTime() - ninetyDays;

        return this.itemCreatedOn.getTime() > newerThanDate;
    }

    @Override
    public String toString() {

        return this.name + "\n" +
                "$" + this.price + "\n" +
                this.description + "\n" +
                "On our menu since: " + this.itemCreatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return price == menuItem.price &&
                name.equals(menuItem.name) &&
                description.equals(menuItem.description) &&
                mealCategory == menuItem.mealCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, mealCategory);
    }
}