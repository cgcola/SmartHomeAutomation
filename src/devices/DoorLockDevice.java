package devices;

public class DoorLockDevice {
    private boolean locked = true;

    public String lock() {
        locked = true;
        return "Door is LOCKED";
    }

    public String unlock() {
        locked = false;
        return "Door is UNLOCKED";
    }
}
