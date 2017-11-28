package pl.mordesku.sda.facade.coffee.machine;

import pl.mordesku.sda.facade.coffee.machine.ingredients.CoffeeIngredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:32
 */
public class CoffeeBeverage {
    private List<CoffeeIngredient> ingredients = new ArrayList<CoffeeIngredient>();

    public boolean addIngredient(CoffeeIngredient coffeeIngredient) {
        return ingredients.add(coffeeIngredient);
    }

    @Override
    public String toString() {
        String input = "sdfsdfsdfsdf";
        boolean x = isX(input);
        if (x) {
            System.out.println("sdfsdf");
        }
        return "CoffeeBeverage{" +
                "ingredients=" + ingredients +
                '}';
    }

    private boolean isX(String input) {
        String test = new String(input);
        return test.contains("x");
    }
}
