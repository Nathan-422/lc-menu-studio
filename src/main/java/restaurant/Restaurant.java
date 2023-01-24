package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        Menu menu = new Menu();

        MenuItem coffee = new MenuItem("Coffee", 4, "A damn fine cup of coffee.", Catagory.DRINK);
        MenuItem pie = new MenuItem("Pie", 6, "A big slice of cherry pie.", Catagory.DESSERT);
        MenuItem donut = new MenuItem("Donut", 1, "The best donuts in town.", Catagory.BREAKFAST);

        menu.addMenuItem(coffee);
        menu.addMenuItem(pie);
        menu.addMenuItem(donut);

        System.out.println(menu);

    }
}
