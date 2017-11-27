package pl.mordesku.sda.facade.coffee.machine;

import pl.mordesku.sda.facade.coffee.machine.exception.CoffeeGrinderException;
import pl.mordesku.sda.facade.coffee.machine.frother.MilkFrother;
import pl.mordesku.sda.facade.coffee.machine.grinder.CoffeGrinder;
import pl.mordesku.sda.facade.coffee.machine.grinder.CoffeePowderIngredient;
import pl.mordesku.sda.facade.coffee.machine.ingredients.WaterIngredient;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-11-27
 * Time: 20:13
 */
public class SimpleCoffeeMachineFacade {
    private AdvancedCoffeeMachine advancedCoffeeMachine = new AdvancedCoffeeMachine();
    private CoffeGrinder coffeGrinder = new CoffeGrinder();
    private MilkFrother milkFrother = new MilkFrother();

    public CoffeeBeverage makeEspresso() {
        CoffeePowderIngredient grind = null;
        while(grind == null) {
            try {
                grind = coffeGrinder.grind(new CoffeeBean());
            } catch (CoffeeGrinderException e) {
                coffeGrinder.empty();
                System.out.println("Waste cleaned!!!");
            }
        }
        advancedCoffeeMachine.addIngredient(grind);
        advancedCoffeeMachine.addIngredient(new WaterIngredient(30));
        return advancedCoffeeMachine.makeCoffeeBeverage();
    }
}
