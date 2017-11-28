package pl.mordesku.sda.bridge;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 28.11.2017
 * Time: 16:13
 */
public class PrintingApp {
    public static void main(String[] args) {
        MySuperService mySuperService = new MySuperService(new MyPrinter());
        mySuperService.printData("tralalalalala");
    }
}
