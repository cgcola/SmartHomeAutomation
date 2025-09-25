package devices;

public class Light implements PowerDevice {
    private int brightness = 50;
    private boolean isOn = false;

    @Override
    public String turnOn() {
        if (isOn) return "Light is already ON";
        isOn = true;
        return "Light is ON";
    }

    @Override
    public String turnOff() {
        if (!isOn) return "Light is already OFF";
        isOn = false;
        return "Light is OFF";
    }

    public String setBrightness(int level) {
        if (!isOn) return "Light is OFF. Turn it on first.";
        if (level < 1 || level > 100) return "Brightness must be between 1 and 100";
        brightness = level;
        return "Light brightness set to " + brightness + "%";
    }
}
