package pl.mordesku.sda.facade.coffee.machine.grinder;

import pl.mordesku.sda.facade.coffee.machine.CoffeeBean;
import pl.mordesku.sda.facade.coffee.machine.exception.CoffeeGrinderException;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:34
 */
public class CoffeGrinder {
    private int wasteContainerCount = 0;
    public void empty() {
        wasteContainerCount = 0;
    }

    public CoffeePowderIngredient grind(CoffeeBean bean) throws CoffeeGrinderException {
        if (wasteContainerCount > 3) {
            throw new CoffeeGrinderException("Waste container is Full");
        }
        if (bean == null) {
            throw new IllegalArgumentException("bean can't be null");
        }
        wasteContainerCount++;
        System.out.println("Coffee grinder wasteContainerCount="+wasteContainerCount);
        return new CoffeePowderIngredient();
    }
}
