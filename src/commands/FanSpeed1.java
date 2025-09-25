package commands;
import devices.SmartFan;

public class FanSpeed1 implements Command {
    private final SmartFan fan;
    public FanSpeed1(SmartFan fan) {
        this.fan = fan;
    }
    @Override
    public String execute() {
        return fan.setSpeed(1);
    }
}