package pl.mordesku.sda.vehicle.controll;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with notepad.exe.
 * Author: mordesku
 * Date: 28.11.2017
 * Time: 16:19
 */
public class VehicleController {
    public static final String ERROR_MESSAGE = "Only 1-4 digits allowed";
    private static List<IVehicle> vehicles = Arrays.asList(
            new Car("Trabant"),
            new Boat("ORP Błyskawica"),
            new Aircraft("Boeing 737")
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                processInput(input);
            } else {
                System.out.println(ERROR_MESSAGE);
                scanner.next();
            }
        }
    }

    private static void processInput(int input) {
        switch (input) {
            case 1:
                vehicles.forEach(v->v.moveUp());
                break;
            case 2:
                vehicles.forEach(v->v.moveDown());
                break;
            case 3:
                vehicles.forEach(v->v.moveLeft());
                break;
            case 4:
                vehicles.forEach(v->v.moveRight());
                break;
            default:
                System.out.println(ERROR_MESSAGE);
                break;
        }
    }
}
