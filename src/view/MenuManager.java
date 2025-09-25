package view;
import java.util.Scanner;

public class MenuManager {
    private final Scanner sc = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("\n=== Smart Home Hub ===");
        System.out.println("1. TV");
        System.out.println("2. Light");
        System.out.println("3. Music Player");
        System.out.println("4. Thermostat");
        System.out.println("5. Smart Fan");
        System.out.println("6. Door Lock");
        System.out.println("0. Exit");
        System.out.print("Choose a device: ");
        return sc.nextInt();
    }

    public int showDeviceMenu (String deviceName, String[] options) {
        System.out.println("\n--- " + deviceName + " Controls ---");
        for (int i = 0; i < options.length; i++){
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Choose an action: ");
        return sc.nextInt();
    }
}
