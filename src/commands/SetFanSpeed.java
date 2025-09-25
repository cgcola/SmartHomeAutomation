package commands;
import devices.SmartFan;

public class SetFanSpeed implements Command {
    private final SmartFan fan;
    private final int speed;

    public SetFanSpeed(SmartFan fan, int speed) {
        this.fan = fan;
        this.speed = speed;
    }

    @Override
    public String execute() {
        return fan.setSpeed(speed);
    }
}