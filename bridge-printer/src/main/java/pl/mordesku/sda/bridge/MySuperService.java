package pl.mordesku.sda.bridge;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 28.11.2017
 * Time: 16:10
 */
public class MySuperService {
    private MyPrinter printer;

    public MySuperService(MyPrinter printer) {
        this.printer = printer;
    }

    public void printData(String data) {
        printer.printMessage(data);
    }
}
