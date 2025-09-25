package commands;
import devices.DoorLockDevice;

public class DoorUnlock implements Command {
    private final DoorLockDevice door;
    public DoorUnlock(DoorLockDevice door) {
        this.door = door;
    }
    @Override
    public String execute() {
        return door.unlock();
    }
}