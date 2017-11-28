package pl.mordesku.sda.facade.coffee.machine.ingredients;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:28
 */
public abstract class CoffeeIngredient {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
