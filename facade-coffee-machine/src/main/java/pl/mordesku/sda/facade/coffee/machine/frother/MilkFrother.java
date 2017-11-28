package pl.mordesku.sda.facade.coffee.machine.frother;

import pl.mordesku.sda.facade.coffee.machine.exception.MilkFrotherException;
import pl.mordesku.sda.facade.coffee.machine.ingredients.MilkIngredient;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:45
 */
public class MilkFrother {
    public FoamedMilkIngredient froth(MilkIngredient milk) throws MilkFrotherException {
        if (Math.random() > 0.8) {
            throw new MilkFrotherException("Some random accident happened :(");
        }
        if (milk == null) {
            throw new IllegalArgumentException("milk can't be null");
        }
        return new FoamedMilkIngredient();
    }
}
