package pl.mordesku.sda.facade.coffee.machine.ingredients;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 26.11.2017
 * Time: 22:30
 */
public class WaterIngredient extends CoffeeIngredient {
    private final int quantity;

    public WaterIngredient(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString()+" "+quantity+"ml";
    }
}
