package app;
import commands.*;
import controller.RemoteControl;
import devices.*;
import view.MenuManager;

public class SmartHomeApp {
    public static void main(String[] args) {

        Tv tv = new Tv();
        Light light = new Light();
        MusicPlayer player = new MusicPlayer();
        Thermostat thermostat = new Thermostat();
        SmartFan fan = new SmartFan();
        DoorLockDevice doorLock = new DoorLockDevice();

        RemoteControl remote = new RemoteControl();
        MenuManager menu = new MenuManager();

        boolean running = true;
        while (running) {
            int choice = menu.showMainMenu();

            switch (choice) {
                case 0: {
                    System.out.println("Exiting Smart Home Hub. Goodbye!");
                    running = false;
                    break;
                }
                case 1: {
                    String[] tvOptions = {"Power On", "Power Off"};
                    int action = menu.showDeviceMenu("TV", tvOptions);
                    if (action == 1) remote.setCommand(new PowerOn(tv));
                    else if (action == 2) remote.setCommand(new PowerOff(tv));
                    break;
                }
                case 2: {
                    String[] lightOptions = {"Light On", "Light Off"};
                    int action = menu.showDeviceMenu("Light", lightOptions);
                    if (action == 1) remote.setCommand(new LightOn(light));
                    else if (action == 2) remote.setCommand(new LightOff(light));
                    break;
                }
                case 3: {
                    String[] musicOptions = {"Play Music", "Stop Music", "Increase Volume", "Decrease Volume"};
                    int action = menu.showDeviceMenu("Music Player", musicOptions);
                    if (action == 1) remote.setCommand(new PlayMusic(player));
                    else if (action == 2) remote.setCommand(new StopMusic(player));
                    else if (action == 3) remote.setCommand(new IncreaseVolume(player));
                    else if (action == 4) remote.setCommand(new DecreaseVolume(player));
                    break;
                }
                case 4: {
                    String[] tempOptions = {"Increase Temperature", "Decrease Temperature"};
                    int action = menu.showDeviceMenu("Thermostat", tempOptions);
                    if (action == 1) remote.setCommand(new IncreaseTemp(thermostat));
                    else if (action == 2) remote.setCommand(new DecreaseTemp(thermostat));
                    break;
                }
                case 5: {
                    String[] fanOptions = {"Fan On", "Fan Off", "Set Speed 1", "Set Speed 2", "Set Speed 3"};
                    int action = menu.showDeviceMenu("Smart Fan", fanOptions);
                    if (action == 1) remote.setCommand(new FanOn(fan));
                    else if (action == 2) remote.setCommand(new FanOff(fan));
                    else if (action == 3) remote.setCommand(new FanSpeed1(fan));
                    else if (action == 4) remote.setCommand(new FanSpeed2(fan));
                    else if (action == 5) remote.setCommand(new FanSpeed3(fan));
                    break;
                }
                case 6: {
                    String[] lockOptions = {"Lock Door", "Unlock Door"};
                    int action = menu.showDeviceMenu("Door Lock", lockOptions);
                    if (action == 1) remote.setCommand(new DoorLock(doorLock));
                    else if (action == 2) remote.setCommand(new DoorUnlock(doorLock));
                    break;
                }
                default: System.out.println("Invalid choice, please try again.");
                break;
            }
            if (remote.getCommand() != null && running) {
                System.out.println(remote.clickButton());
            }
        }
    }
}
