package commands;
import devices.DoorLockDevice;

public class DoorLock implements Command {
    private final DoorLockDevice door;
    public DoorLock(DoorLockDevice door) {
        this.door = door;
    }
    @Override
    public String execute() {
        return door.lock();
    }
}