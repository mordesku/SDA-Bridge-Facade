package pl.mordesku.sda.vehicle.controll;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 28.11.2017
 * Time: 16:17
 */
public class Boat implements IVehicle {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    public void moveRight() {
        System.out.println(name+" is moving right");
    }

    public void moveLeft() {
        System.out.println(name+" is moving left");
    }

    public void moveUp() {
        System.out.println(name+" is moving up");
    }

    public void moveDown() {
        System.out.println(name+" is moving down");
    }
}
