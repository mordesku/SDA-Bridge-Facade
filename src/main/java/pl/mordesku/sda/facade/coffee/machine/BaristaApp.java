package pl.mordesku.sda.facade.coffee.machine;

import pl.mordesku.sda.facade.coffee.machine.exception.CoffeeGrinderException;
import pl.mordesku.sda.facade.coffee.machine.exception.MilkFrotherException;
import pl.mordesku.sda.facade.coffee.machine.frother.MilkFrother;
import pl.mordesku.sda.facade.coffee.machine.ingredients.MilkIngredient;
import pl.mordesku.sda.facade.coffee.machine.grinder.CoffeGrinder;
import pl.mordesku.sda.facade.coffee.machine.ingredients.WaterIngredient;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:52
 */
public class BaristaApp {
    public static void main(String[] args) throws CoffeeGrinderException, MilkFrotherException {
        AdvancedCoffeeMachine advancedCoffeeMachine = new AdvancedCoffeeMachine();
        CoffeGrinder coffeGrinder = new CoffeGrinder();
        MilkFrother milkFrother = new MilkFrother();

        advancedCoffeeMachine.addIngredient(coffeGrinder.grind(new CoffeeBean()));
        advancedCoffeeMachine.addIngredient(new WaterIngredient(100));
        advancedCoffeeMachine.addIngredient(milkFrother.froth(new MilkIngredient()));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeverage());

        advancedCoffeeMachine.addIngredient(coffeGrinder.grind(new CoffeeBean()));
        advancedCoffeeMachine.addIngredient(new WaterIngredient(30));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeverage());

        advancedCoffeeMachine.addIngredient(coffeGrinder.grind(new CoffeeBean()));
        advancedCoffeeMachine.addIngredient(new WaterIngredient(30));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeverage());

        advancedCoffeeMachine.addIngredient(coffeGrinder.grind(new CoffeeBean()));
        advancedCoffeeMachine.addIngredient(new WaterIngredient(100));
        System.out.println(advancedCoffeeMachine.makeCoffeeBeverage());

        coffeGrinder.empty();

        advancedCoffeeMachine.addIngredient(coffeGrinder.grind(new CoffeeBean()));
        advancedCoffeeMachine.addIngredient(new WaterIngredient(30));
        advancedCoffeeMachine.addIngredient(milkFrother.froth(new MilkIngredient()));
        advancedCoffeeMachine.addIngredient(new MilkIngredient());
        System.out.println(advancedCoffeeMachine.makeCoffeeBeverage());

        advancedCoffeeMachine.addIngredient(coffeGrinder.grind(new CoffeeBean()));
        advancedCoffeeMachine.addIngredient(new WaterIngredient(30));
        advancedCoffeeMachine.addIngredient(milkFrother.froth(new MilkIngredient()));
        advancedCoffeeMachine.addIngredient(new MilkIngredient());
        System.out.println(advancedCoffeeMachine.makeCoffeeBeverage());

    }
}
