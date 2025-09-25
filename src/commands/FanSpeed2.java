package commands;
import devices.SmartFan;

public class FanSpeed2 implements Command {
    private final SmartFan fan;
    public FanSpeed2(SmartFan fan) {
        this.fan = fan;
    }
    @Override
    public String execute() {
        return fan.setSpeed(2);
    }
}
