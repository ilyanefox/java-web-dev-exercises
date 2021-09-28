package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingsComparator implements Comparator<Toppings> {
    @Override
    public int compare(Toppings topping1, Toppings topping2) {
        return topping1.getName().compareTo(topping2.getName());
    }

//    @Override
//    public int compare(Toppings topping1, Toppings topping2) {
//        if (topping1.getCost() - topping2.getCost() < 0) {
//            return -1;
//        } else if (topping1.getCost() - topping2.getCost() > 0) {
//            return 1;
//        } else {
//            return 0;
//        }

 //   }
}
