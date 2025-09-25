package client;

import commands.*;
import invoker.RemoteControl;
import devices.*;
import view.MenuManager;
import java.util.Scanner;

public class SmartHomeApp {

    private static final RemoteControl remote = new RemoteControl();
    private static final MenuManager menu = new MenuManager();
    private static final Scanner scanner = new Scanner(System.in);

    private static final Tv tv = new Tv();
    private static final Light light = new Light();
    private static final MusicPlayer player = new MusicPlayer();
    private static final Thermostat thermostat = new Thermostat();
    private static final SmartFan fan = new SmartFan();
    private static final DoorLockDevice doorLock = new DoorLockDevice();

    public static void main(String[] args) {

        boolean running = true;
        while (running) {
            int choice = menu.showMainMenu();

            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting Smart Home Hub. Goodbye!");
                    running = false;
                }
                case 1 -> handleTvMenu();
                case 2 -> handleLightMenu();
                case 3 -> handleMusicPlayerMenu();
                case 4 -> handleThermostatMenu();
                case 5 -> handleFanMenu();
                case 6 -> handleDoorLockMenu();
                default -> System.out.println("Invalid choice, please try again.");
            }

            if (remote.getCommand() != null && running) {
                System.out.println(remote.clickButton());
            }
        }
    }

    private static void handleTvMenu() {
        String[] tvOptions = {"Power On", "Power Off", "Increase Volume", "Decrease Volume", "Set Channel"};
        int action = menu.showDeviceMenu("TV", tvOptions);

        switch (action) {
            case 1 -> remote.setCommand(new PowerCommand(tv, true));
            case 2 -> remote.setCommand(new PowerCommand(tv, false));
            case 3 -> remote.setCommand(new VolumeCommand(tv, true));
            case 4 -> remote.setCommand(new VolumeCommand(tv, false));
            case 5 -> {
                System.out.print("Enter channel number: ");
                int channel = scanner.nextInt();
                remote.setCommand(new TVSetChannel(tv, channel));
            }
        }
    }

    private static void handleLightMenu() {
        String[] lightOptions = {"Light On", "Light Off", "Set Brightness"};
        int action = menu.showDeviceMenu("Light", lightOptions);

        switch (action) {
            case 1 -> remote.setCommand(new PowerCommand(light, true));
            case 2 -> remote.setCommand(new PowerCommand(light, false));
            case 3 -> {
                System.out.print("Enter brightness (1-100): ");
                int brightness = scanner.nextInt();
                remote.setCommand(new SetBrightness(light, brightness));
            }
        }
    }

    private static void handleMusicPlayerMenu() {
        String[] musicOptions = {"Play Music", "Stop Music", "Increase Volume", "Decrease Volume"};
        int action = menu.showDeviceMenu("Music Player", musicOptions);

        switch (action) {
            case 1 -> remote.setCommand(new PlayMusic(player));
            case 2 -> remote.setCommand(new StopMusic(player));
            case 3 -> remote.setCommand(new VolumeCommand(player, true));
            case 4 -> remote.setCommand(new VolumeCommand(player, false));
        }
    }

    private static void handleThermostatMenu() {
        String[] tempOptions = {"Increase Temperature", "Decrease Temperature"};
        int action = menu.showDeviceMenu("Thermostat", tempOptions);

        switch (action) {
            case 1 -> remote.setCommand(new IncreaseTemp(thermostat));
            case 2 -> remote.setCommand(new DecreaseTemp(thermostat));
        }
    }

    private static void handleFanMenu() {
        String[] fanOptions = {"Fan On", "Fan Off", "Set Speed 1", "Set Speed 2", "Set Speed 3", "Toggle Oscillation"};
        int action = menu.showDeviceMenu("Smart Fan", fanOptions);

        switch (action) {
            case 1 -> remote.setCommand(new PowerCommand(fan, true));
            case 2 -> remote.setCommand(new PowerCommand(fan, false));
            case 3 -> remote.setCommand(new SetFanSpeed(fan, 1));
            case 4 -> remote.setCommand(new SetFanSpeed(fan, 2));
            case 5 -> remote.setCommand(new SetFanSpeed(fan, 3));
            case 6 -> remote.setCommand(new ToggleOscillation(fan));
        }
    }

    private static void handleDoorLockMenu() {
        String[] lockOptions = {"Lock Door", "Unlock Door"};
        int action = menu.showDeviceMenu("Door Lock", lockOptions);

        switch (action) {
            case 1 -> remote.setCommand(new DoorLock(doorLock));
            case 2 -> remote.setCommand(new DoorUnlock(doorLock));
        }
    }
}
