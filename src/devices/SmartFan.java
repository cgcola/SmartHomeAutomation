package devices;

public class SmartFan implements PowerDevice {
    private boolean isOn = false;
    private int speed = 0;
    private boolean oscillating = false;

    @Override
    public String turnOn() {
        isOn = true;
        if (speed == 0) speed = 1;
        return "Smart Fan is ON at speed " + speed;
    }

    @Override
    public String turnOff() {
        isOn = false;
        speed = 0;
        oscillating = false;
        return "Smart Fan is OFF";
    }

    public String setSpeed(int level) {
        if (!isOn) return "Smart Fan is OFF. Turn it on first.";
        speed = level;
        return "Smart Fan speed set to " + speed;
    }

    public String toggleOscillation() {
        if (!isOn) return "Smart Fan is OFF. Turn it on first.";
        oscillating = !oscillating;
        return oscillating ? "Smart Fan oscillation ON" : "Smart Fan oscillation OFF";
    }
}
