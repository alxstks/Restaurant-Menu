package menu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newItem1 = new MenuItem(8.99, "Soft Tacos", "Dinner", true);
        MenuItem newItem2 = new MenuItem(12.99, "Ice Cream Sandwich", "Dessert", false);
        MenuItem newItem3 = new MenuItem(149.99, "Ortolan", "App", true);
        MenuItem newItem4 = new MenuItem(19.99, "Dagwood", "Dinner", false);

        Date today = Calendar.getInstance().getTime();
        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);

        ourMenu = new Menu(today, startingMenu);

        ourMenu.addItem(newItem1);
        ourMenu.addItem(newItem2);
        ourMenu.addItem(newItem3);
        ourMenu.addItem(newItem4);

        ourMenu.printMenu();

        ourMenu.printItem(newItem3);

        ourMenu.removeItem((newItem3));

        ourMenu.printMenu();




    }
}
