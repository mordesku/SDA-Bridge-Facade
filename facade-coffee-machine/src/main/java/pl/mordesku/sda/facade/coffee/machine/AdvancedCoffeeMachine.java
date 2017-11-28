package pl.mordesku.sda.facade.coffee.machine;

import pl.mordesku.sda.facade.coffee.machine.ingredients.CoffeeIngredient;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:50
 */
public class AdvancedCoffeeMachine {
    private CoffeeBeverage currentProcessedCoffee = new CoffeeBeverage();

    public boolean addIngredient(CoffeeIngredient coffeeIngredient) {
        return currentProcessedCoffee.addIngredient(coffeeIngredient);
    }

    public CoffeeBeverage makeCoffeeBeverage() {
        CoffeeBeverage coffee = currentProcessedCoffee;
        currentProcessedCoffee = new CoffeeBeverage();
        return coffee;
    }
}
