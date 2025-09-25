package commands;

import devices.PowerDevice;

public class PowerCommand implements Command {
    private final PowerDevice device;
    private final boolean turnOn;

    public PowerCommand(PowerDevice device, boolean turnOn) {
        this.device = device;
        this.turnOn = turnOn;
    }

    @Override
    public String execute() {
        return turnOn ? device.turnOn() : device.turnOff();
    }
}
