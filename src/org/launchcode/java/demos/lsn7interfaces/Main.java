package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();
        Comparator comparator = new FlavorComparator();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        flavors.sort(comparator);
        // could also combine declaring and initializing comparator object into single statement:
        // flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        cones.sort(new ConeComparator());

        toppings.sort(new ToppingsComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }

        for (Toppings topping : toppings) {
            System.out.println(topping.getName() + ": " + topping.getCost());
        }
    }
}
