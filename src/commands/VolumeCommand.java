package commands;

import devices.VolumeControl;

public class VolumeCommand implements Command {
    private final VolumeControl device;
    private final boolean increase;

    public VolumeCommand(VolumeControl device, boolean increase) {
        this.device = device;
        this.increase = increase;
    }

    @Override
    public String execute() {
        return increase ? device.increaseVolume() : device.decreaseVolume();
    }
}
