package commands;
import devices.SmartFan;

public class FanSpeed3 implements Command {
    private final SmartFan fan;
    public FanSpeed3(SmartFan fan) {
        this.fan = fan;
    }
    @Override
    public String execute() {
        return fan.setSpeed(3);
    }
}
