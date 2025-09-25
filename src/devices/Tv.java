package devices;

public class Tv implements PowerDevice, VolumeControl {
    private boolean isOn = false;
    private int volume = 20;
    private int channel = 1;

    @Override
    public String turnOn() {
        if (isOn) return "TV is already ON";
        isOn = true;
        return "TV is ON";
    }

    @Override
    public String turnOff() {
        if (!isOn) return "TV is already OFF";
        isOn = false;
        return "TV is OFF";
    }

    @Override
    public String increaseVolume() {
        if (!isOn) return "TV is OFF. Turn it on first.";
        if (volume < 100) volume++;
        return "TV volume increased to " + volume;
    }

    @Override
    public String decreaseVolume() {
        if (!isOn) return "TV is OFF. Turn it on first.";
        if (volume > 0) volume--;
        return "TV volume decreased to " + volume;
    }

    public String setChannel(int channel) {
        if (!isOn) return "TV is OFF. Turn it on first.";
        this.channel = channel;
        return "TV channel set to " + channel;
    }
}
