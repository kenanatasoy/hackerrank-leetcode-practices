package org.example.practices;

import java.util.Scanner;

interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Pizza!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Cake!";
    }
}


class FoodFactory {

    public Food getFood(String order) {

        order = order.toLowerCase();

        if (order.equals("cake"))
            return new Cake();

        if (order.equals("pizza"))
            return new Pizza();

        return null;
    }

}

public class JavaFactoryPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creating the factory
        FoodFactory foodFactory = new FoodFactory();

        //factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());

        sc.close();

        System.out.println("The factory returned " + (food == null ? "no food" : food.getClass()));

        System.out.println(food == null ? "no food type" : food.getType());

    }
}



