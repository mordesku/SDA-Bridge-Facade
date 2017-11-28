package pl.mordesku.sda.bridge;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 28.11.2017
 * Time: 16:11
 */
public class MyPrinter implements IPrinter {
    public void printMessage(String message) {
        System.out.println(message);
    }
}
