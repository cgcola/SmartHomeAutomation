package devices;

public class DoorLockDevice {
    private boolean locked = true;

    public String lock() {
        if (locked) return "Door is already LOCKED";
        locked = true;
        return "Door is LOCKED";
    }

    public String unlock() {
        if (!locked) return "Door is already UNLOCKED";
        locked = false;
        return "Door is UNLOCKED";
    }
}